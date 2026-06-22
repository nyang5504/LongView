package main.java.com.nyang5504.LongView.controller;

import main.java.com.nyang5504.LongView.dto.StockRequestDto;
import main.java.com.nyang5504.LongView.dto.StockResultDto;
import main.java.com.nyang5504.LongView.service.StockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/testing")
    public String test(){
        return "seems to be working";
    }

    @PostMapping("/api/calculate")
    public StockResultDto calculate(@RequestBody StockRequestDto request){
        return StockService.calculate(request);
    }
}
