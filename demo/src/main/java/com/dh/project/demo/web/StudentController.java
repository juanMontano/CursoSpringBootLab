package com.dh.project.demo.web;

import com.dh.project.demo.domain.Student;
import com.dh.project.demo.service.StudentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")

public class StudentController {

        @Autowired
        private StudentService studentService;

        //dependency Injection
        // Get all students
        @RequestMapping(method = RequestMethod.GET)
        public List<Student> getAllStudent(){
            return studentService.getAllStudents();
        }

        @RequestMapping(path="/{id}",method = RequestMethod.GET)
        public Student getStudentById(@PathVariable String id){
            return studentService.getStudentById(id);
        }
        // insert new Student
        @RequestMapping(method = RequestMethod.POST)
        public void addNewStudent(@RequestBody Student newStudent){
            System.out.println("the Name of new Student is "+newStudent.getName());
            studentService.addNewStudent(newStudent);
        }
        // delete Student : localhost:9090/student/2
        @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
        public void deleteStudent(@PathVariable String id){
            System.out.println("the Id delete is " + id);
            studentService.deleteStudent(id);

        }

        // delete Student by Id using Request Body
        @RequestMapping(method = RequestMethod.DELETE)
        public void deleteStudentByRequ(@RequestBody Student student){
            studentService.deleteStudent(student.getId());
        }
}
