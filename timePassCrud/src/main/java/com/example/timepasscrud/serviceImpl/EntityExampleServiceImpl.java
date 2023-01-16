package com.example.timepasscrud.serviceImpl;

import com.example.timepasscrud.entity.EntityExample;
import com.example.timepasscrud.repository.EntityExampleRepository;
import com.example.timepasscrud.service.EntityExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityExampleServiceImpl implements EntityExampleService {

    @Autowired
    EntityExampleRepository entityExampleRepository;
    @Override
    public EntityExample saveEntityExample(EntityExample entityExample) {
        return entityExampleRepository.save(entityExample);
    }

    @Override
    public EntityExample getEntityExample(Long id) {
        return entityExampleRepository.findById(id).get();
    }

    @Override
    public List<EntityExample> saveListOfEntityExample(List<EntityExample> entityExamples) {
        return entityExampleRepository.saveAll(entityExamples);
    }

    @Override
    public List<EntityExample> getListOfEntityExample() {
        return entityExampleRepository.findAll();
    }

    @Override
    public EntityExample updateEntityExample(EntityExample entityExample) {
        EntityExample entityExample1 = entityExampleRepository.findById(entityExample.getId()).orElse(null);

        entityExample1.setId(entityExample.getId());
        entityExample1.setName(entityExample.getName());
        return entityExampleRepository.save(entityExample1);
    }

    @Override
    public String deleteEntityExample(EntityExample id) {
         entityExampleRepository.deleteById(id.getId());
         return "Deleted Successfully";
    }
}
