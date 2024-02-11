package com.coder;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
//@RequestMapping(path = "/api", method = RequestMethod.GET)
public class HelloController {

    // @GetMapping("/hello")

    // public String sayHello(){
    // return "hello Vim";
    // }
    @GetMapping("/hello")
    public String printTextString(@RequestParam(name = "param", required = false) String param) {
        return "nalo :" + param;
    }

    @GetMapping("users")
    public List<User> getAllUsers(@RequestBody List<User> users) {
        users.forEach(item -> System.out.println(item.getName()));
        return users;
    }

    @GetMapping("headeeer")
    public String getHeadeeerString(@RequestHeader(name = "Content-Type") String headeeer) {
        return "header me : " + headeeer;
    }

}