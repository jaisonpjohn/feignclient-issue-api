package com.jaison.springrest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

  @RequestMapping(value = "/items/{id}", method = RequestMethod.PUT)
  public String updateItem(@PathVariable("id") final Integer id, @RequestBody String request){
    System.out.println(request);
    return "Recieved request: "+request;
  }

}
