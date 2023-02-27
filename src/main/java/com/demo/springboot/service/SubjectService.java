package com.demo.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springboot.bean.Subject;
import com.demo.springboot.repository.SubjectRepository;

@Service
public class SubjectService {

	@Autowired
	private SubjectRepository subjectrepository;

	// GET Request
	public List<Subject> getAllSubjects() {
		// TODO Auto-generated method stub
		List<Subject> subjects = new ArrayList<>();
		return subjects;
	}

	// CREATE Request
	public void addSubject(Subject subject) {
		// TODO Auto-generated method stub
		subjectrepository.save(subject);

	}

	// UPDATE Request
	public void updateSubject(String id, Subject subject) {
		// TODO Auto-generated method stub
		subjectrepository.save(subject);
	}

	// DELETE Request
	public void deleteSubject(String id) {
		// TODO Auto-generated method stub
		subjectrepository.deleteById(id);

	}

}
