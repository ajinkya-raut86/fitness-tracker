package com.project.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("path", method=RequestMethod.GET)
public String requestMethodName(@RequestParam String param) {
    return new String();
}

public class hello {

}
