package com.jd.my_docker.service;

import com.jd.my_docker.model.ResourceEntity;
import com.jd.my_docker.repository.ResourceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class ResourceService {
    private final ResourceRepository repository;

    public ResourceEntity getResource(Long id){
        return repository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public ResourceEntity save(String value) {
        ResourceEntity entity = new ResourceEntity();
        entity.setValue(value);
        return repository.save(entity);
    }
}
