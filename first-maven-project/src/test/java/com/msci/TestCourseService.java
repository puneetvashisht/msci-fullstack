package com.msci;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCourseService {
    CourseService courseService;

    @BeforeEach
    public void setUp(){
        courseService = new CourseService();
    }

    @Test
    public void testFindCourseByTitle(){
        String title = "Angular";
        boolean result = courseService.findCourseByTitle(title);
        assertTrue(result);
    }
    @Test
    public void testFindCourseByTitleNotFound(){
        String title = "NodeJS";
        boolean result = courseService.findCourseByTitle(title);
        assertFalse(result);
    }

}
