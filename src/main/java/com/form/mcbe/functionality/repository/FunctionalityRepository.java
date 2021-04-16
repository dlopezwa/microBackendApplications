package com.form.mcbe.functionality.repository;

import com.form.mcbe.functionality.entity.Functionality;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(excerptProjection = Functionality.class)
public interface FunctionalityRepository extends CrudRepository<Functionality, Long> {
}