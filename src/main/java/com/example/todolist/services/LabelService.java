package com.example.todolist.services;

import com.example.todolist.exception.LabelNotFoundException;
import com.example.todolist.model.Label;
import com.example.todolist.repository.LabelRepository;
import com.example.todolist.repository.ToDoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelService {

    @Autowired
    private LabelRepository labelRepository;
    @Autowired
    private ToDoItemRepository todoItemRepository;

    public LabelService(LabelRepository labelRepository) {
        this.labelRepository = labelRepository;
    }

    public LabelService() {
    }

    public List<Label> getAll() {
        return labelRepository.findAll();
    }

    public Label get(String id) throws LabelNotFoundException {
        return LabelRepository.findById(id).orElseThrow(() -> new LabelNotFoundException()) ;
    }

    public Label create(Label label) {
        return labelRepository.save(label);
    }

    public Label update(String id, Label label) throws LabelNotFoundException {
        if (labelRepository.existsById(id)){
            label.setlabelId(id);
            return labelRepository.save(label);
        }
        throw new LabelNotFoundException();
    }

    public void delete(String id){
        labelRepository.deleteById(id);
    }
}
