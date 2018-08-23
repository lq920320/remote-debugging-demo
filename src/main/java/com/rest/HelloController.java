package com.rest;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuqian
 */
@RestController("/hello")
public class HelloController {

  @GetMapping
  public String hello(
    @RequestParam(value = "name", required = false) String name
  ) {
    System.out.println("alsdklasoidjpaos");
    if (StringUtils.isEmpty(name)) {
      name = "the world!";
    }
    return "Hello, " + name;
  }

}