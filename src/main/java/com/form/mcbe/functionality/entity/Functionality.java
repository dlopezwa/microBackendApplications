package com.form.mcbe.functionality.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.form.mcbe.application.entity.Application;

import lombok.Data;

@Data
@Entity
public class Functionality {
    
    @Id
    @GeneratedValue
    private long id;
    
    @Column(nullable=false)
    private String description;

    @Column(nullable=false)
    private String url;

    @ManyToOne
    @JoinColumn(name="applicationid", nullable=false)
    private Application application;
   
}
