package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	public List<Course> getAllCourses(String topicId) {
		//return courses;
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
	}
	
	public Course getCourse2(String id) {
		//return courses.stream().filter(t -> t.getid().equals(id)).findFirst().get();
	
		return courseRepository.findOne(id);
	}
	
	/*public List<Course> getCourse(String Subj) {
		
		//lines.stream().filter(line -> !"mkyong".equals(line)).collect(Collectors.toList()); 
		return (List<Course>) courses.stream().filter(t -> t.getSubj().equals(Subj)).collect(Collectors.toList());
	}*/
	
/*public List<Course> getCourses(String Instructor) {
		
		//lines.stream().filter(line -> !"mkyong".equals(line)).collect(Collectors.toList()); 
		return (List<Course>) courses.stream().filter(t -> t.getInstructor().equals(Instructor)).collect(Collectors.toList());
	}*/

public void addCourse(Course course) {
	// TODO Auto-generated method stub
	//courses.add(course);
	courseRepository.save(course);
}

public void updateCourse(Course course) {
	// TODO Auto-generated method stub
	/*for (int i = 0; i< courses.size(); i++) {
		Course t = courses.get(i);
		if(t.getid().equals(id)) {
			courses.set(i, course);
			return;
		}
	}*/
	
	courseRepository.save(course);
}

public void deleteCourse(String id) {
	//courses.removeIf(t -> t.getid().equals(id));
	
	courseRepository.delete(id);
}

}
