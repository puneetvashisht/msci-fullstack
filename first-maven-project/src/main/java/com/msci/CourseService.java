package com.msci;

import java.util.ArrayList;
import java.util.List;

public class CourseService {

    List<Course> courses;
    {
        courses = new ArrayList<>();
        courses.add(new Course(23, "Angular", 34343.34));
        
      
    }

    public boolean findCourseByTitle(String title){
        if(title == null)  throw new CourseNotFoundException();
        boolean result =  courses.stream().anyMatch((c) -> c.title.equals(title));
        return result;
    }
}

