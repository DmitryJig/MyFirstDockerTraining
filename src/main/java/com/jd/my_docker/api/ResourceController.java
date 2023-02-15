package com.jd.my_docker.api;

import com.jd.my_docker.model.ResourceEntity;
import com.jd.my_docker.service.ResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ResourceController {
    private final ResourceService resourceService;

    @GetMapping("/resource/{id}")
    public ResourceEntity getResourceById(@PathVariable Long id){
        return resourceService.getResource(id);
    }

    @GetMapping("/resource")
    public ResourceEntity createResource(@RequestParam(name = "value") String value){
        return resourceService.save(value);
    }
}
