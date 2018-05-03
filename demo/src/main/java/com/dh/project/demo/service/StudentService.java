package com.dh.project.demo.service;

import com.dh.project.demo.domain.Student;
import com.dh.project.demo.domain.Teacher;
import com.dh.project.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentService(){

    }


    // CRUD
    // List Students
    public List<Student> getAllStudents(){
        //get all documents from collection teacher
        return studentRepository.findAll();

        // get all student from DB
        //return listStudent;
    }
    // Add new Student
    public void addNewStudent(Student newStudent){

        studentRepository.save(newStudent);

    }

    // Delete Teacher by Id

    public void deleteStudent(String id){
        // delete a teacher by id in DB
        studentRepository.delete(id);
        //listTeacher.remove(id);
    }

    // Get a student By Id

    public Student getStudentById(String id){
        // get a Teacher by id from DB
        return studentRepository.findOne(id);
        //return listTeacher.get(id);
    }

}
