package com.practice.hibenrateexample.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    protected Course(){}
}
