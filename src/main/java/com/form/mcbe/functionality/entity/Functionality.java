package com.form.mcbe.functionality.entity;

import com.form.mcbe.application.entity.Application;

import javax.persistence.*;

@Entity
public class Functionality {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String url;

    @ManyToOne()
    @JoinColumn(name = "applicationid", nullable = false)
    private Application application;

}