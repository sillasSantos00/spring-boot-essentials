package br.com.sillas.spring_boot_essentials.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello")
public class HellowordController {

    @GetMapping
    public String helloworld() {
        return "hello world";
    }

}
