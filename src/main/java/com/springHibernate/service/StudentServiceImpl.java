package com.springHibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springHibernate.dao.StudentDAO;
import com.springHibernate.model.Students;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDAO studentDAO;

	@Override
	public void createStudent(Students student) {
		studentDAO.createStudent(student);
		
	}

	@Override
	public List<Students> getStudentList() {
		List<Students> students = studentDAO.getStudentList();
		return students;
	}

	@Override
	public Students getStudentDetails(int id) {
		Students st = studentDAO.getStudentDetails(id);
		return st;
	}

	@Override
	public void deteleStudent(int id) {
		// TODO Auto-generated method stub
		studentDAO.deteleStudent(id);
	}

}
