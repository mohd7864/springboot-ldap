package com.springboot.ldap.entity;

import javax.naming.Name;

import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;

@Entry(base = "ou=People", objectClasses = { "person", "inetOrgPerson", "top" })
public class Person  {
        
    @Id
    private Name id;
    
    private @Attribute(name = "cn") String username;

    public Person() {
    }

    public Person(String username) {
        this.username = username;
    }

    public Name getId() {
        return id;
    }

    public void setId(Name id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return username;
    }

}