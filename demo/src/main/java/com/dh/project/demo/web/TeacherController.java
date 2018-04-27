package com.dh.project.demo.web;

import com.dh.project.demo.domain.Teacher;
import com.dh.project.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jhonny on 5/18/17.
 */
@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    TeacherService teacherService;
    //list
    //GET localhost:9090/teacher
    @RequestMapping(method = RequestMethod.GET)
    public List<Teacher> getTeacher(){
        return teacherService.getAllTeachers();
    }
    //delete
    @RequestMapping(path= "/hello",method = RequestMethod.DELETE)
    public List<Teacher> hello(){
        return teacherService.getAllTeachers();
    }

    //insert
    @RequestMapping(path= "/hello",method = RequestMethod.POST)
    public List<Teacher> insert(){
        return teacherService.getAllTeachers();
    }
}

