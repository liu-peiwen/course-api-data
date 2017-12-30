package io.javabrains.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javabrains.springbootstarter.topic.Topic;

@Entity
public class Course {
	
	@Id
	private String id;
	private String f2;
	private String f3;
	
	@ManyToOne
	private Topic topic;

	public Course() {
		
	}
	
	public Course(String id, String f2, String f3, String topicId) {
		super();
		this.id = id;
		this.f2 = f2;
		this.f3 = f3;
		this.topic = new Topic(topicId, "", "");
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getF2() {
		return f2;
	}
	public void setF2(String f2) {
		this.f2 = f2;
	}
	public String getF3() {
		return f3;
	}
	public void setF3(String f3) {
		this.f3 = f3;
	}
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
}
