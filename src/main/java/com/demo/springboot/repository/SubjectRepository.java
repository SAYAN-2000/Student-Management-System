package com.demo.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.springboot.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject, String>{
	 

}
