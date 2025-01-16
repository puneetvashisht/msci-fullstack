package com.msci.spring_boot_demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CourseController {

    List<Course> courses = new ArrayList<>();

    {
        courses.add(new Course(1, "Math", 3434));
        courses.add(new Course(2, "Science", 34332));
        courses.add(new Course(3, "English", 2222));
        courses.add(new Course(4, "History", 1111));
        courses.add(new Course(5, "Geography", 9999));
    }
    
    @RequestMapping(path="/courses", method=RequestMethod.GET)
    public List<Course> getAllCourses(){
        return courses;
    }

    @RequestMapping(path="/courses", method=RequestMethod.POST)
    public void addCourse(@RequestBody Course course) {
        courses.add(course);
        // return "Course added successfully!";
    }

    @RequestMapping(path="/courses", method=RequestMethod.DELETE)
    public void deleteCourse(@RequestParam int id) {
        courses.removeIf(c -> c.getId() == id);
        // return "Course deleted successfully!";
    }
    
    

    @RequestMapping(path="/hello", method=RequestMethod.GET)    
    public String sayHello(){
        return "Hello !";
    }
    
}
