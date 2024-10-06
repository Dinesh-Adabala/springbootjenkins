package com.neoteric.dockerlearning.springbootdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerConttroller {
    @GetMapping(value = "/docker")
    public String getDocker(){
        return "Hello from docker";
    }
}
