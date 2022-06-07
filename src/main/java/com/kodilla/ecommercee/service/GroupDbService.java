package com.kodilla.ecommercee.service;


import com.kodilla.ecommercee.entity.Group;
import com.kodilla.ecommercee.repository.GroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GroupDbService {

    private final GroupRepository repository;

    public List<Group> getAllGroups(){
        return repository.findAll();
    }

    public Optional<Group> getGroup(Long id){
        return repository.findById(id);
    }

    public Group saveGroup(final Group group){
        return repository.save(group);
    }





}
