package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
	//getAllTopics()
	
	//getTopic(String f1)
	
	//updateTopic(String f1, Topic topic)
	
	//deleteTopic(String f1)
}
