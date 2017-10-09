package io.javabrains.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javabrains.springbootstarter.topic.Topic;

@Entity
public class Course {
	
	@Id
	private String id;
	//private String Select;
	private String crn;
	private String subj;
	public String crse;
	public String sec;
	public String cmp;
	public String cred;
	public String part_of_term;
	public String title;
	public String days;
	public String time;
	public String cap;
	public String act;
	public String rem;
	public String instructor;
	public String date;
	public String location;
	public String attribute;
	
	@ManyToOne
	private Topic topic;
	
	public Course() {
		
		
		
	}
	
	

	public Course(String id, String crn, String subj, String crse, String sec, String cmp, String cred,
			String part_of_term, String title, String days, String time, String cap, String act, String rem,
			String instructor, String date, String location, String attribute, String topicId) {
		super();
		this.id = id;
		this.crn = crn;
		this.subj = subj;
		this.crse = crse;
		this.sec = sec;
		this.cmp = cmp;
		this.cred = cred;
		this.part_of_term = part_of_term;
		this.title = title;
		this.days = days;
		this.time = time;
		this.cap = cap;
		this.act = act;
		this.rem = rem;
		this.instructor = instructor;
		this.date = date;
		this.location = location;
		this.attribute = attribute;
		this.topic = new Topic(topicId, "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCrn() {
		return crn;
	}

	public void setCrn(String crn) {
		this.crn = crn;
	}

	public String getSubj() {
		return subj;
	}

	public void setSubj(String subj) {
		this.subj = subj;
	}

	public String getCrse() {
		return crse;
	}

	public void setCrse(String crse) {
		this.crse = crse;
	}

	public String getSec() {
		return sec;
	}

	public void setSec(String sec) {
		this.sec = sec;
	}

	public String getCmp() {
		return cmp;
	}

	public void setCmp(String cmp) {
		this.cmp = cmp;
	}

	public String getCred() {
		return cred;
	}

	public void setCred(String cred) {
		this.cred = cred;
	}

	public String getPart_of_term() {
		return part_of_term;
	}

	public void setPart_of_term(String part_of_term) {
		this.part_of_term = part_of_term;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	public String getAct() {
		return act;
	}

	public void setAct(String act) {
		this.act = act;
	}

	public String getRem() {
		return rem;
	}

	public void setRem(String rem) {
		this.rem = rem;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}



	public Topic getTopic() {
		return topic;
	}



	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	
	

	
	
	
	
	
	/*private String name;
	private String description;
	
	
	public Course(String id, String name, String description) {
		super();
		Id = id;
		this.name = name;
		this.description = description;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}*/
	
	
	
	
	
}
