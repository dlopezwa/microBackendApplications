package com.form.mcbe.application.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Application {
    @Id
    @GeneratedValue
    private long id;
}