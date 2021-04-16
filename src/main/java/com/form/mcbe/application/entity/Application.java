package com.form.mcbe.application.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.form.mcbe.functionality.entity.Functionality;

import lombok.Data;

@Data
@Entity
public class Application {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String description;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "application")
    private List<Functionality> functionalities;
}
