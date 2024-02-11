package com.coder;

import org.springframework.context.annotation.Lazy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class MyController {


    public MyController(@Lazy MyComponent myComponent) {
        this.myComponent = myComponent;
    }

    private MyComponent myComponent;

    @GetMapping("/name")

    public String getComponentName() {

        return "haho :" + this.myComponent.getName();
    }

}
