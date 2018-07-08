package com.springboot.ldap.repository;

import java.util.List;

import org.springframework.data.ldap.repository.LdapRepository;
import org.springframework.stereotype.Repository;

import com.springboot.ldap.entity.Person;

@Repository
public interface PersonRepository extends LdapRepository<Person> {

    Person findByUsername(String username);
    
    Person create(String username);

    //Person findByUsernameAndPassword(String username, String password);

    List<Person> findByUsernameLikeIgnoreCase(String username);

}
