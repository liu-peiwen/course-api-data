package io.javabrains.springbootstarter.topic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

	List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("a", "b", "c"),
			new Topic("d", "e", "f")));
	
	public List<Topic> getAllTopics() {
		//return topics;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String f1) {
		//return topics.stream().filter(t -> t.getF1().equals(f1)).findFirst().get();
		return topicRepository.findOne(f1);
	}
	
	public void addTopic(Topic topic) {
		//topics.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, String f1) {
		topicRepository.save(topic);
		
	}
}
