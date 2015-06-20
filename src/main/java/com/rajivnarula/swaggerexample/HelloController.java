package com.rajivnarula.swaggerexample;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {


	@RequestMapping(value = "/hello", method = { RequestMethod.POST })
    public String helloWorld(@RequestParam(value = "name", required = true) String name) {
     return "Hello "+name;
    }

}

