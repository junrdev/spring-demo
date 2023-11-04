package com.junrdev.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junrdev.todo.entity.Todo;
import com.junrdev.todo.repo.TodoRepo;

@Service
public class TodoService { 
	
	@Autowired
	private TodoRepo repo;
	
	
	public Todo createTodo(String title, String content) {
		Todo todo = new Todo(title, content, false);
		
		return repo.save(todo);
	}
	
	public List<Todo> getTodos() {
		return repo.findAll();
	}

}
