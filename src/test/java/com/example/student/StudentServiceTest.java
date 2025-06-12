package com.example.student;

import org.example.model.Student;
import org.example.service.StudentService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {

    StudentService studentService;

    @BeforeEach
     void setUp() {
        studentService = new StudentService();
    }

    @Test
    void testAddStudentSuccessfully(){

        Student s1 = new Student(1 , "amit" , 21);
        studentService.add_student(s1);

        assertEquals(new Student(1, "amit", 21), s1);
        assertEquals(studentService.get_AllStudent().size() , 1);

    }

    @Test
    void isGettingAllStudentSuccessfully(){


        Student s1 = new Student(1 , "amit" , 20);
        Student s2 = new Student(2, "sumit" , 30);
        studentService.add_student(s1);
        studentService.add_student(s2);

        List<Student> list = studentService.get_AllStudent();

        assertEquals(2 , list.size());
        assertTrue(list.contains(s1) , "s1 should be added");
        assertTrue(list.contains(s1) , "s2 should be added");
    }

    @Test
    void isStudentDeletedByIdSuccessfully(){

        Student s1= new Student(1 , "yogesh" , 22);
        Student s2= new Student(2 , "mahesh" , 23);
        studentService.add_student(s1);
        studentService.add_student(s2);
        studentService.deleteStudentById(1);

        assertEquals(1 , studentService.get_AllStudent().size());
    }
    
}
