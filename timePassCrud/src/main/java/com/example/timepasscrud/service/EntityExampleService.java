package com.example.timepasscrud.service;

import com.example.timepasscrud.entity.EntityExample;

import java.util.List;

public interface EntityExampleService {
    EntityExample saveEntityExample(EntityExample entityExample);

    EntityExample getEntityExample(Long id);

    List<EntityExample> saveListOfEntityExample(List<EntityExample> entityExamples);

    List<EntityExample> getListOfEntityExample();

    EntityExample updateEntityExample(EntityExample entityExample);

    String deleteEntityExample(EntityExample id);
}
