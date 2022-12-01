package pl.sobota.skillstracker.controller;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.sobota.skillstracker.repository.ActivityRepository;

import java.awt.print.Book;

@Data
@Controller
public class TestController {





    @GetMapping("/test1")
    public String test1(){
        return "index";
    }

    @ResponseBody
    @GetMapping("/test2")
    public String test2(){
        return "test2";
    }

    @ResponseBody
    @GetMapping("/test3")
    public String test3(){
        return "test3";
    }



}