package com.springrest.springrest.services;

import com.springrest.springrest.entities.Courses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {
    List<Courses> list;
    public CourseServiceImpl(){
        list = new ArrayList<>();
        list.add(new Courses(2,"Node","basic"));
        list.add(new Courses(3,"java","basic"));

    }
    @Override
    public List<Courses> getCourses() {
        return list;
    }

    @Override
    public Courses getCourse(long courseId) {
        Courses c= null;
        for(Courses course:list){
            if(course.getId()==courseId){
                c=course;
                break;
            }
        }
        return c;
    }
    @Override
    public Courses addCourse(Courses new_course) {
        list.add(new Courses(new_course.getId(),new_course.getTitle(),new_course.getDescription()));
        return new_course;
    }
}
