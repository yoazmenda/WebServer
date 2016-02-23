package com.example.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yoazm on 2/23/2016.
 */

@RestController
public class SampleController {


    @RequestMapping("/")
    public ResponseEntity<String> mainController(){
        return new ResponseEntity<String>("Welcome!", HttpStatus.OK);
    }

}
