package net.guides.springboot.todomanagement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "todos")
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String userName;
	
	public String taskName;

	@Size(min = 8, message = "Enter at least 8 Characters...")
	private String description;

	private Date startDate;
	
	private Date endDate;
	
	public String email;
	
	private String severity;
	
	public Todo() {
		super();
	}

	public Todo(String user, String taskName, String desc, Date startDate, Date endDate, String email, String severity, boolean isDone) {
		super();
		this.userName = user;
		this.taskName = taskName;
		this.description = desc;
		this.startDate = startDate;
		this.endDate = endDate;
		this.email = email;
		this.severity = severity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getTaskName() {
		return userName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public String getEmail() {
		return userName;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}
}