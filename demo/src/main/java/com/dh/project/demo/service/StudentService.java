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
    // List Teachers
    public List<Student> getAllStudents(){
        //get all documents from collection teacher
        return studentRepository.findAll();

        // get all teacher from DB
        //return listTeacher;
    }
    // Add new Teacher
    public void addNewStudent(Student newStudent){
        // insert new Teacher into DB
        studentRepository.save(newStudent);
        //listTeacher.add( newTeacher);
    }

    // Delete Teacher by Id

    public void deleteStudent(String id){
        // delete a teacher by id in DB
        studentRepository.delete(id);
        //listTeacher.remove(id);
    }

    // Get a teacher By Id

    public Student getStudentById(String id){
        // get a Teacher by id from DB
        return studentRepository.findOne(id);
        //return listTeacher.get(id);
    }

}
