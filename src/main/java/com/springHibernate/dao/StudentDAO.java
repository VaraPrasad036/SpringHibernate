package com.springHibernate.dao;

import java.util.List;

import com.springHibernate.model.Students;

public interface StudentDAO {

	void createStudent(Students student);

	List<Students> getStudentList();

	Students getStudentDetails(int id);

	void deteleStudent(int id);

}
