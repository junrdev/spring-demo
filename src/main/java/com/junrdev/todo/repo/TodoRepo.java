package com.junrdev.todo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junrdev.todo.entity.Todo;

@Repository
public interface TodoRepo extends JpaRepository<Todo, Long>{

}
