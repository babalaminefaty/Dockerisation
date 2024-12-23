package sn.faty.docker.Dockerisation.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/docker")
@RestController
public class DockerController {

    @GetMapping("/message")
    public  String getMessage(){

        return "Hello Docker";
    }
}
