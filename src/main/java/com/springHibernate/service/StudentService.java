package com.springHibernate.service;

import java.util.List;

import com.springHibernate.model.Students;

public interface StudentService {

	void createStudent(Students student);

	List<Students> getStudentList();

	Students getStudentDetails(int id);

	void deteleStudent(int id);

}
