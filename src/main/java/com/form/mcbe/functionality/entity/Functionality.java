package com.form.mcbe.functionality.entity;

import com.form.mcbe.application.entity.Application;
import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.*;

@Data
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH,
        RequestMethod.DELETE })
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