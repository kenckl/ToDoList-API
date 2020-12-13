package com.example.todolist.controller;

import com.example.todolist.dto.LabelRequest;
import com.example.todolist.dto.LabelResponse;
import com.example.todolist.model.Label;
import com.example.todolist.mapper.LabelMapper;
import com.example.todolist.services.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/labels")
@CrossOrigin
public class LabelController {
    @Autowired
    private LabelService labelService;
    @Autowired
    private LabelMapper labelMapper;

    @GetMapping
    public List<LabelResponse> getAll() {
        List<Label> labels = labelService.getAll();
        return labels.stream().map(labelMapper::toResponse).collect(Collectors.toList());
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public LabelResponse addLabel(@RequestBody LabelRequest labelRequest) {
        Label label = labelService.create(labelMapper.toEntity(labelRequest));
        return labelMapper.toResponse(label);
    }

    @DeleteMapping("/{labelID}")
    public void deleteLabel(@PathVariable String labelID) {
        labelService.delete(labelID);
    }

    @PutMapping("/{labelID}")
    public LabelResponse updateLabel(@PathVariable String labelID, @RequestBody LabelRequest labelRequest) {
        Label label = labelService.update(labelID, labelMapper.toEntity(labelRequest));
        return labelMapper.toResponse(label);
    }
}