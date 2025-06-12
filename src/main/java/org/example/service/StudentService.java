package org.example.service;

import org.example.model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentService {
    List<Student> studentList = new ArrayList<>(10);

    public Student add_student(Student student){
        studentList.add(student);
        return student;
    }

    public List<Student> get_AllStudent(){
        return studentList;
    }

    public boolean deleteStudentById(int id) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public void deleteAll(){
        studentList.clear();
    }
}
