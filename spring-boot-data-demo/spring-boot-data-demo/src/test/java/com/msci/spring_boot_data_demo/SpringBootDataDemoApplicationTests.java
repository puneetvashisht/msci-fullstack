package com.msci.spring_boot_data_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@ExtendWith(MockitoExtension.class)
class SpringBootDataDemoApplicationTests {

	@Mock
	CourseRepository courseRepository;  // Mocking the CourseRepository interface  // Mockito is a mocking framework for Java. It allows you to create mock objects and control their behavior. In this case, we're mocking the CourseRepository interface to make our test independent of the actual implementation.  // Mockito is a popular mocking framework for Java that allows you to create mock objects and control their behavior. It provides a wide range of features, including mocking static methods, mocking final

	@InjectMocks
	CourseService courseService;


	@Test
	public void testCourseServiceFindById() {

		Course c = new Course(1, "React", 22222);
        when(courseRepository.findById(1)).thenReturn(Optional.of(c));

		Course course = courseService.getCourseById(1);
		System.out.println(course);


		verify(courseRepository, times(1)).findById(1);
		assertEquals(course.getTitle(), "React"); 
	}


	@Test
	public void testCourseServiceFindByIdForException() {

        when(courseRepository.findById(999)).thenReturn(Optional.empty());


		// verify(courseRepository, times(1)).findById(1);
		// assertEquals(course.getTitle(), "React");
		 assertThrows(CourseNotFoundException.class, ()-> courseService.getCourseById(999));
	}

}
