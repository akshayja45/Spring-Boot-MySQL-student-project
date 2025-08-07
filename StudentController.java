package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Students")
public class StudentController {

	@Autowired
	private StudentRepository repo;
	
	@PostMapping
	public String addStudent(@RequestBody Student student)
	{
		repo.save(student);
		return "Student Added SuccessFully";
	}
	
	@GetMapping
	public List<Student>getAllStudent()
	{
		return repo.findAll();
	}
	
	@PutMapping
	public String updateStudent(@RequestBody Student student)
	{
		repo.update(student);
		return " Student Data Updated";
	}
	
	@DeleteMapping("/{id}")
	public String deletestudent(@PathVariable int id)
	{
		repo.delete(id);
		return "Student Record Deleted SuccessFully";
	}
	
	
}
