package com.junrdev.todo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(
		name = "todos"
		)
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String title;
	
	private String content;
	
	private Boolean isDone;
	
	

	public Todo() {
	}

	public Todo(String title, String content, Boolean isDone) {
		this.title = title;
		this.content = content;
		this.isDone = isDone;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Boolean getIsDone() {
		return isDone;
	}

	public void setIsDone(Boolean isDone) {
		this.isDone = isDone;
	}

	public Long getId() {
		return id;
	}
	
	

}
