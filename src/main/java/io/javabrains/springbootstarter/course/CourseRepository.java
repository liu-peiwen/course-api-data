package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	
	//get course by course name
	//You don't need to implement the method. Just declare the method with the findByProperty name format, 
	//and Spring Data JPA will implement the method for you
	public List<Course> findByF2(String f2);
	
	//getAllTopics()
	
	//getTopic(String f1)
	
	//updateTopic(String f1, Topic topic)
	
	//deleteTopic(String f1)
}
