package com.dh.project.demo.web;

import com.dh.project.demo.domain.Teacher;
import com.dh.project.demo.service.TeacherService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jhonny on 5/18/17.
 */
@RestController
@RequestMapping("/teachers")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class TeacherController {
    //dependency injection
    @Autowired
    private TeacherService teacherService;

    //get all teachers
    @RequestMapping(method = RequestMethod.GET)
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @RequestMapping(path = "/{id}",method = RequestMethod.GET)
    public Teacher getTeachersById(@PathVariable  int id) {
        //System.out.println("" + newTeacher.getName());
        return teacherService.getTeacher(id);
    }

    //insert new teacher
    @RequestMapping(method = RequestMethod.POST)
    public void addNewTeacher(@RequestBody Teacher newTeacher) {
        System.out.println("" + newTeacher.getName());
        teacherService.addNewTeacher(newTeacher);

    }

    //delete teacher: localhost:8080/teacher/2
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void deleteTeacher(@PathVariable int id) {
        System.out.println("the id delete is" + id);
        teacherService.deleteTeacher(id);
    }

    // delete teacher by id using Request body
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteTeacherByRequest(@RequestBody Teacher newTeacher) {
        System.out.println("name of delete teacher" + newTeacher.getName());
        teacherService.deleteTeacher((int) newTeacher.getId());

    }


}

