package com.form.mcbe.application.entity;

import com.form.mcbe.functionality.entity.Functionality;
import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.*;
import java.util.List;

@Data
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH,
        RequestMethod.DELETE })
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