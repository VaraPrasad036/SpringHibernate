package com.springHibernate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springHibernate.model.Students;

@Repository
public class StudentDaoImpl implements StudentDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void createStudent(Students student) {
		System.out.println("Get Name of the Student"+student.getFirstName());
		Session session = sessionFactory.getCurrentSession();
		session.save(student);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<Students> getStudentList() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Students.class);
		List<Students> s = criteria.list();
		return s;
	}

	@Override
	public Students getStudentDetails(int id) {
		Session session = sessionFactory.getCurrentSession();
		Students students = session.get(Students.class, id);
		return students;
	}

	@Override
	public void deteleStudent(int id) {
		Session session = sessionFactory.getCurrentSession();
		Students student = getStudentDetails(id);
		System.out.println("Student details"+student);
		session.delete(student);
	}

}
