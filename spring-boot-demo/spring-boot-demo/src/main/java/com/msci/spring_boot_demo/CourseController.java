package com.msci.spring_boot_demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
@CrossOrigin
public class CourseController {

    List<Course> courses = new ArrayList<>();

    {
        courses.add(new Course(1, "Math", 3434));
        courses.add(new Course(2, "Science", 34332));
        courses.add(new Course(3, "English", 2222));
        courses.add(new Course(4, "History", 1111));
        courses.add(new Course(5, "Geography", 9999));
    }
    

    // get course by id
    @RequestMapping(path="/courses/{id}", method=RequestMethod.GET)
    public Course getCourseById(@PathVariable int id){
        return courses.stream().filter(c -> c.getId() == id).findFirst().orElseThrow(() -> new CourseNotFoundException("Course not found"));
    }

    @RequestMapping(path="/courses", method=RequestMethod.GET)
    public List<Course> getAllCourses(){
        return courses;
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @RequestMapping(path="/courses", method=RequestMethod.POST)
    public void addCourse(@RequestBody Course course) {
        courses.add(course);
        // return "Course added successfully!";
    }

    @ResponseStatus(code = HttpStatus.NO_CONTENT)
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
