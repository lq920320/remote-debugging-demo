package com.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuqian
 */
@RestController("/hello")
public class HelloController {

  @GetMapping
  public String hello(@RequestParam("name") String name) {
    System.out.println("alsdklasoidjpaos");
    return "Hello, " + name;
  }

}