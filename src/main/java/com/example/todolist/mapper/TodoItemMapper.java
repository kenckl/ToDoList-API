package com.example.todolist.mapper;
import com.example.todolist.model.ToDoItem;
import com.example.todolist.dto.TodoItemRequest;
import com.example.todolist.dto.TodoItemResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class TodoItemMapper {

    public TodoItemResponse toResponse(ToDoItem todoItem){
        TodoItemResponse todoItemResponse = new TodoItemResponse();
        BeanUtils.copyProperties(todoItem, todoItemResponse);
        return todoItemResponse;
    }

    public ToDoItem toEntity(TodoItemRequest todoItemRequest){
        ToDoItem todoItem = new ToDoItem();
        BeanUtils.copyProperties(todoItemRequest, todoItem);
        return todoItem;
    }
}
