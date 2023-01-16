package com.example.timepasscrud.controller;

import com.example.timepasscrud.entity.EntityExample;
import com.example.timepasscrud.service.EntityExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EntityExampleController {

    @Autowired
    EntityExampleService entityExampleService;

    @PostMapping("/saveEntity")
    public EntityExample saveEntityExample(@RequestBody EntityExample entityExample){
        return entityExampleService.saveEntityExample(entityExample);
    }

    @GetMapping("/getEntity/{id}")
    public EntityExample getEntityExample(@PathVariable Long id){
        return entityExampleService.getEntityExample(id);
    }

    @PostMapping("/saveListOfEntityExample")
    public List<EntityExample> saveListOfEntityExample(@RequestBody List<EntityExample> entityExamples){
        return  entityExampleService.saveListOfEntityExample(entityExamples);
    }

    @GetMapping("/getListOfEntityExample")
    public List<EntityExample> getListOfEntityExample(){
        return entityExampleService.getListOfEntityExample();
    }

    @PutMapping("/updateEntityExample/{id}")
    public EntityExample updateEntityExample(@RequestBody EntityExample entityExample){
        return entityExampleService.updateEntityExample(entityExample);
    }

    @DeleteMapping("/deletemapping/{id}")
    public String deleteEntityExample(@PathVariable EntityExample id){
        return entityExampleService.deleteEntityExample(id);
    }
}
