package com.example.todolist.controller;

import com.example.todolist.dto.TodoItemRequest;
import com.example.todolist.dto.TodoItemResponse;
import com.example.todolist.exception.ToDoItemNotFoundException;
import com.example.todolist.mapper.TodoItemMapper;
import com.example.todolist.model.ToDoItem;
import com.example.todolist.services.ToDoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/todos")
public class ToDoItemController {

    private final ToDoItemService toDoItemService;
    private final TodoItemMapper todoItemMapper;

    public ToDoItemController(ToDoItemService toDoItemService, TodoItemMapper todoItemMapper) {
        this.toDoItemService = toDoItemService;
        this.todoItemMapper = todoItemMapper;
    }

    @GetMapping
    public List<TodoItemResponse> getAll() {
        List<ToDoItem> todoItems = toDoItemService.getAll();
        return todoItems.stream().map(todoItemMapper::toResponse).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public TodoItemResponse getById(@PathVariable String id) throws ToDoItemNotFoundException {
        ToDoItem  todoItem = toDoItemService.get(id);
        return todoItemMapper.toResponse(todoItem);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TodoItemResponse addTodoItem(@RequestBody TodoItemRequest todoItemRequest) {
        ToDoItem todoItem = toDoItemService.create(todoItemMapper.toEntity(todoItemRequest));
        return todoItemMapper.toResponse(todoItem);
    }

    @DeleteMapping("/{id}")
    public void deleteTodoItem(@PathVariable String id) {
        toDoItemService.delete(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TodoItemResponse updateTodoItem(@PathVariable String id,@RequestBody TodoItemRequest todoItemRequest) throws ToDoItemNotFoundException {
        ToDoItem todoItem = toDoItemService.update(id,todoItemMapper.toEntity(todoItemRequest));
        return todoItemMapper.toResponse(todoItem);
    }

}
