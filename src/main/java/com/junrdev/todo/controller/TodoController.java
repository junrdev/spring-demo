package com.junrdev.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junrdev.todo.dto.TodoDto;
import com.junrdev.todo.entity.Todo;
import com.junrdev.todo.service.TodoService;


//TODO: Rest APIs

@RestController
@RequestMapping("/api")
public class TodoController {
	
	@Autowired
	private TodoService service;

	@PostMapping
	public ResponseEntity<Todo> createTodo(
			@RequestBody TodoDto todoDto
			) {
		
		return ResponseEntity.ok(service.createTodo(todoDto.getTitle(), todoDto.getContent()));
	}
	
	@GetMapping
	public ResponseEntity<List<Todo>> fetchAll() {
		return ResponseEntity.ok(service.getTodos());
	}
	
}
