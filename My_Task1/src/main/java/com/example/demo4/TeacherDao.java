package com.example.demo4;



import com.example.demo1.Teacher;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TeacherDao extends JpaRepository<Teacher, Long> {
 
 
}