package com.dh.project.demo.service;

import com.dh.project.demo.domain.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;


/**
 * Created by jhonny on .
 */
@Service
public class TeacherService {
    private List<Teacher> listTeachers=new ArrayList<>();

    public TeacherService() {
        listTeachers.add(new Teacher(0, "jhonny"));
        listTeachers.add(new Teacher(1, "Gabriel"));
        listTeachers.add(new Teacher(2, "Jorge"));
        listTeachers.add(new Teacher(3, "Marco"));
    }

        //Grud
        //List teachers
        public List<Teacher> getAllTeachers() {
            return listTeachers;
        }
        //Add new Teachers
        public void addNewTeacher (Teacher newTeacher){
            listTeachers.add(newTeacher);
        }

        //deletye teachers by id
        public void deleteTeacher ( int id){
            listTeachers.remove(id);
        }
        //get teacher by id
        public Teacher getTeacher (int i){
            return listTeachers.get(i);
        }


   /* public List<Teacher> getAllTeachers(){
        List<Teacher> listTeachers = new ArrayList<>();
        listTeachers.add(new Teacher(1, "jhonny"));
        listTeachers.add(new Teacher(2, "Gabriel"));
        listTeachers.add(new Teacher(3, "Su"));
        return listTeachers;
    }*/

    }


