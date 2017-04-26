package com.sdajava.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by user on 2017-04-26.
 */
@Entity
@Table(name = "persons", schema = "ksiegarnia")
public class PersonsEntity {
    private int id;
    private String first_name;
    private String lastname;

    @Column(name = "first_name", nullable = true, length = 128)
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    @Column(name = "lastname", nullable = true, length = 128)
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
