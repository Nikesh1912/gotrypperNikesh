package com.goTrypper.technology.controller;

import com.goTrypper.technology.model.Message;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value = "/v1")
public class MessageController {
    @PostMapping(value = "/show_message",produces = MediaType.APPLICATION_JSON_VALUE)
   public Message loadData(@RequestBody Message message) throws IOException {
    System.out.println("api called for loading all data");
    return message;
    }

}
//{"message":"hello world"}