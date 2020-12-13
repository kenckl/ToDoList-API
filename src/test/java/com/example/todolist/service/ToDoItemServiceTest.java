package com.example.todolist.service;

import com.example.todolist.model.ToDoItem;
import com.example.todolist.repository.ToDoItemRepository;
import com.example.todolist.services.ToDoItemService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class ToDoItemServiceTest {

    @InjectMocks
    private ToDoItemService todoService;

    @Mock
    private ToDoItemRepository todoRepository;

    @Test
    void should_return_toDoItem_when_create_given_toDoItem() {
        //given
        ToDoItem toDoItem = new ToDoItem("Item 1", false, new ArrayList<>());
        when(todoRepository.save(toDoItem)).thenReturn(toDoItem);

        //when
        final ToDoItem actual = todoService.create(toDoItem);

        //then
        assertEquals(toDoItem, actual);
    }

    @Test
    void should_return_all_toDoItem_when_get_all_todos_given_toDoItems() {
        //given
        ToDoItem todo = new ToDoItem("task 1", false, new ArrayList<>());
        final List<ToDoItem> expected = Collections.singletonList(todo);
        todoService.create(todo);
        when(todoRepository.findAll()).thenReturn(expected);

        //when
        final List<ToDoItem> actual = todoService.getAll();

        //then
        assertEquals(expected, actual);
    }
}
