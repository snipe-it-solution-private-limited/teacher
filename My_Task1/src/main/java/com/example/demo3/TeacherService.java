package com.example.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo4.TeacherDao;
import com.example.demo1.Teacher;

@Service
public class TeacherService {

	@Autowired
	private TeacherDao teacherDao;
	
	public Teacher createTeacher1(Teacher teacher) {
		return (Teacher) teacherDao.save(teacher);
	}
	
	public Iterable<Teacher> getAllTeacher() {
		return teacherDao.findAll();
	}

	public Teacher getTeacherById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteTeacher(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public Teacher createTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return null;
	}
	

	

	
	
	
	
}