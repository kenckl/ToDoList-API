package com.example.todolist.repository;

import com.example.todolist.model.ToDoItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoItemRepository extends MongoRepository<ToDoItem,Integer> {
}
