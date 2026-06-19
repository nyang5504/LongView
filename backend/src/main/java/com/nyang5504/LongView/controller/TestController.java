package main.java.com.nyang5504.LongView.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/testing")
    public String test(){
        return "seems to be working";
    }
}
