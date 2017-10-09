package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	
	public List<Topic> getAllTopics() {
		//return topics;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
public Topic getTopic2(String id) {
		//return topics.stream().filter(t -> t.getid().equals(id)).findFirst().get();
	
		return topicRepository.findOne(id);
	}
	
	/*public List<Topic> getTopic(String Subj) {
		
		//lines.stream().filter(line -> !"mkyong".equals(line)).collect(Collectors.toList()); 
		return (List<Topic>) topics.stream().filter(t -> t.getSubj().equals(Subj)).collect(Collectors.toList());
	}*/
	
/*public List<Topic> getTopics(String Instructor) {
		
		//lines.stream().filter(line -> !"mkyong".equals(line)).collect(Collectors.toList()); 
		return (List<Topic>) topics.stream().filter(t -> t.getInstructor().equals(Instructor)).collect(Collectors.toList());
	}*/

public void addTopic(Topic topic) {
	// TODO Auto-generated method stub
	//topics.add(topic);
	topicRepository.save(topic);
}

public void updateTopic(String id, Topic topic) {
	// TODO Auto-generated method stub
	/*for (int i = 0; i< topics.size(); i++) {
		Topic t = topics.get(i);
		if(t.getid().equals(id)) {
			topics.set(i, topic);
			return;
		}
	}*/
	
	topicRepository.save(topic);
}

public void deleteTopic(String id) {
	//topics.removeIf(t -> t.getid().equals(id));
	
	topicRepository.delete(id);
}

}
