package io.javabrains.springbootstarter.course;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;


import java.io.File;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import java.util.Scanner;

public interface CourseRepository extends CrudRepository <Course, String> {
	
	public List<Course> findByTopicId(String topicId);
	
	
	/*public List<Course> findBySubj(String subj);
	public List<Course> findByInstructor(String instructor);*/
	
	
}
