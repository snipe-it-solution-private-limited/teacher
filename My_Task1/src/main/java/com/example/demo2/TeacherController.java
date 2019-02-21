package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.Teacher;
import com.example.demo3.TeacherService;


@RestController

@RequestMapping(value="/api/teacher")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	
	@PostMapping(value="/create", produces="application/json")
	public Teacher createTeacher(@RequestBody Teacher teacher){
		return teacherService.createTeacher(teacher);
	}
	
	@GetMapping(value="/reg/{Id}")
	//@RequestMapping(value="/ticket/{ticketId}")
	public Teacher getTeacherById(@PathVariable("Id")Integer Id){
		return teacherService.getTeacherById(Id);
	}
	@GetMapping(value="/reg/allreg")
	public Iterable<Teacher> getAllTeacher(){
		return teacherService.getAllTeacher();
	}
	
	@DeleteMapping(value="/reg/{Id}")
	public void deleteTeacher(@PathVariable("Id")Integer Id){
		teacherService.deleteTeacher(Id);
	}
	
	
}
