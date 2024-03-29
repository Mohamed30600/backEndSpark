package com.sparkies.spark.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * User Entity for SQL table 'ADMINISTRATEUR'
 */
@Entity
@Table(name = "ADMINISTRATEUR")
public class Admin extends Person {

    /**
     * 'username' -> 'IDENTIFIANT'
     * Max length of 50 'car' (default) && not NULL
     */
    @Column(name = "IDENTIFIANT", length = 50, nullable = false)
    private String username;

    public Admin() {
        // TODO AUTOGENERATED
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Admin [username=" + username + "]";
    }
}
