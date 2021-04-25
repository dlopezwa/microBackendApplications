package com.form.mcbe.functionality.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.form.mcbe.application.entity.Application;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.Data;

@Data
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH,
    RequestMethod.DELETE })
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
