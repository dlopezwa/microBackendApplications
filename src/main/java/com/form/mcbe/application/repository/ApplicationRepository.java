package com.form.mcbe.application.repository;

import com.form.mcbe.application.entity.Application;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(excerptProjection = Application.class)
public interface ApplicationRepository extends CrudRepository<Application, Long> {

}