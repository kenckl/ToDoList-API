package com.example.todolist.services;

import com.example.todolist.exception.ToDoItemNotFoundException;
import com.example.todolist.model.ToDoItem;
import com.example.todolist.repository.ToDoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoItemService {

    @Autowired
    private ToDoItemRepository toDoItemRepository;

    public List<ToDoItem> getAll() {
        return toDoItemRepository.findAll();
    }

    public ToDoItem get(String id) throws ToDoItemNotFoundException {
        return toDoItemRepository.findById(id).orElseThrow(() -> new ToDoItemNotFoundException()) ;

    }
    public ToDoItem create(ToDoItem toDoItem){
        return toDoItemRepository.save(toDoItem);
    }

    public ToDoItem update(String id, ToDoItem toDoItem) throws ToDoItemNotFoundException {
        if (toDoItemRepository.existsById(id)){
            toDoItem.setToDoId(id);
            return toDoItemRepository.save(toDoItem);
        }
        throw new ToDoItemNotFoundException();
    }

    public void delete(String id){
        toDoItemRepository.deleteById(id);
    }

}
