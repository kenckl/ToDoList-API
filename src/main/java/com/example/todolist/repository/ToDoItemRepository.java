package com.example.todolist.repository;

import com.example.todolist.model.ToDoItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoItemRepository extends MongoRepository<ToDoItem,String> {
}
