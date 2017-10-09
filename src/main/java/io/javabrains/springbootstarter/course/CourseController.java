package io.javabrains.springbootstarter.course;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.topic.Topic;

@RestController

public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/list/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}
	
	@RequestMapping("/list/{topicId}/courses/{id}")
	public Course getCourse2(@PathVariable String id) {
		return courseService.getCourse2(id);
	}
	
	/*@RequestMapping("/dept/{Subj}")
	public List<Course> getCourse(@PathVariable String Subj) {
		List<Course> courses = (List<Course>) courseService.getCourse(Subj);
		return courses;
	}
	
	@RequestMapping("/fac/{Instructor}")
	public List<Course> getCourses(@PathVariable String Instructor) {
		List<Course> courses = (List<Course>) courseService.getCourses(Instructor);
		return courses;
	}*/
	
	@RequestMapping(method=RequestMethod.POST, value="/list/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId, "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));
		courseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/list/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId, "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));
		courseService.updateCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/list/{topicId}/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		 courseService.deleteCourse(id);
	}

}
