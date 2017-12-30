package io.javabrains.springbootstarter.course;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

//	List<Course> topics = new ArrayList<Course>(Arrays.asList(
//			new Course("a", "b", "c"),
//			new Course("d", "e", "f")));
	
	public List<Course> getAllCourses(String id) {
		//return topics;
		List<Course> topics = new ArrayList<>();
		courseRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Course getCourse(String f1) {
		//return topics.stream().filter(t -> t.getF1().equals(f1)).findFirst().get();
		return courseRepository.findOne(f1);
	}
	
	public void addCourse(Course topic) {
		//topics.add(topic);
		courseRepository.save(topic);
	}

	public void updateCourse(Course topic) {
		courseRepository.save(topic);
		
	}
}
