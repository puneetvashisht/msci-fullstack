package com.msci;

import java.util.ArrayList;
import java.util.List;

public class CourseService {

    ArrayList<Course> courses;
    {
        courses = new ArrayList<>();
        // add course objects to list
        courses.add(new Course(23, "Angular", 34343.34));
        courses.add(new Course(2, "React", 44434));
        courses.add(new Course(2, "React", 44434));
        courses.add(new Course(2, "React", 44434));
    }

}

