package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/list")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/list/{id}")
	public Topic getTopic2(@PathVariable String id) {
		return topicService.getTopic2(id);
	}
	
	/*@RequestMapping("/dept/{Subj}")
	public List<Topic> getTopic(@PathVariable String Subj) {
		List<Topic> topics = (List<Topic>) topicService.getTopic(Subj);
		return topics;
	}
	
	@RequestMapping("/fac/{Instructor}")
	public List<Topic> getTopics(@PathVariable String Instructor) {
		List<Topic> topics = (List<Topic>) topicService.getTopics(Instructor);
		return topics;
	}*/
	
	@RequestMapping(method=RequestMethod.POST, value="/list")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/list/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/list/{id}")
	public void deleteTopic(@PathVariable String id) {
		 topicService.deleteTopic(id);
	}

}
