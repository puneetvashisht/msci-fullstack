package com.msci.spring_boot_data_demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

     public Course getCourseById(@PathVariable int id){
        Optional<Course> courseFound = courseRepository.findById(id);
        if (courseFound.isPresent()) {
            return courseFound.get();
        } else {
            throw new CourseNotFoundException("Course not found");
        }
        // return courses.stream().filter(c -> c.getId() == id).findFirst().orElseThrow(() -> new CourseNotFoundException("Course not found"));
    }

    
}
