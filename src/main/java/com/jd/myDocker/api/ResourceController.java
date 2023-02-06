package com.jd.myDocker.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    @GetMapping("/resource/{id}")
    public ResourceEntity getResourceById(@PathVariable Long id){
        return resourceService.getResource;
    }

    @PostMapping("/resource")
    public ResourceEntity createResource(@RequestParam String value){
        return resourceService.save(value);
    }
}
