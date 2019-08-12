package com.springHibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springHibernate.model.Students;
import com.springHibernate.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/createStudent")
	public void createStudent(@RequestBody Students student) {
		
		System.out.println("Get Student name"+student.getFirstName());
		studentService.createStudent(student);
		
	}
	
	@GetMapping("/getStudentList")
	public List<Students> getStudentList() {
		List<Students> studentsList = studentService.getStudentList();
		System.out.println("Student List"+studentsList);
		return studentsList;
	}
	
	@GetMapping("/getStudent/{id}")
	public Students getStudentDetails(@PathVariable int id) {
		System.out.println("get Student id"+ id);
		Students student = studentService.getStudentDetails(id);
		System.out.println("get Student Details "+student);
		return student;
		
	}
	
	@DeleteMapping("/deteleStudent/{id}")
	public void deleteStudents(@PathVariable int id) {
		System.out.println("get Student id"+id);
		studentService.deteleStudent(id);
	}

}
