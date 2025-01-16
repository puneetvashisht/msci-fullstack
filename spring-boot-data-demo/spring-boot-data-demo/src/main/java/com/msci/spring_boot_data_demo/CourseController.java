package com.msci.spring_boot_data_demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;
    

    // get course by id
    @RequestMapping(path="/courses/{id}", method=RequestMethod.GET)
    public Course getCourseById(@PathVariable int id){
        Optional<Course> courseFound = courseRepository.findById(id);
        if (courseFound.isPresent()) {
            return courseFound.get();
        } else {
            throw new CourseNotFoundException("Course not found");
        }
        // return courses.stream().filter(c -> c.getId() == id).findFirst().orElseThrow(() -> new CourseNotFoundException("Course not found"));
    }

    @RequestMapping(path="/courses", method=RequestMethod.GET)
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @RequestMapping(path="/courses", method=RequestMethod.POST)
    public void addCourse(@RequestBody Course course) {
        // courses.add(course);
        courseRepository.save(course);
        // return "Course added successfully!";
    }

    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @RequestMapping(path="/courses", method=RequestMethod.DELETE)
    public void deleteCourse(@RequestParam int id) {
       courseRepository.deleteById(id);
        // return "Course deleted successfully!";
    }
    
    

    @RequestMapping(path="/hello", method=RequestMethod.GET)    
    public String sayHello(){
        return "Hello !";
    }
    
}
