package com.assignment.camel.controller;

import com.assignment.camel.domain.Pain001;
import com.assignment.camel.service.Pain001Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PainRestController {

    @Autowired
    Pain001Service pain001Service;

    @RequestMapping(value = "get/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public HttpEntity<Pain001> getPain001(@PathVariable(value = "id") long id) {
        Pain001 myPain001 = pain001Service.findPainById(id);
        if(myPain001 == null){
            return new ResponseEntity<Pain001>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Pain001>(myPain001,HttpStatus.OK);


    }



}
