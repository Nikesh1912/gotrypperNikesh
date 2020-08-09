package com.goTrypper.technology.controller;
import org.springframework.web.bind.annotation.*;

import com.goTrypper.technology.service.FileLoaderService;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(value = "/v1")
public class FileReaderController {
	@Autowired
	FileLoaderService fileLoaderService;

    @PostMapping(value = "/read_data",produces = MediaType.APPLICATION_JSON_VALUE)
     public void loadData() throws IOException {
	 System.out.println("api called for loading all data");
	 fileLoaderService.loadFile();
    }
}
