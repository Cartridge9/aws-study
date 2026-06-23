package dev.pjmin.cicd_springboot_01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public String home() {
        int test = 0;
        return "Hello World! CICD01 IS SUCCESS!";
    }
}
