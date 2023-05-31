package com.example.cruddemo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cruddemo.model.Address;
//import com.example.cruddemo.model.Patientdetails;
import com.example.cruddemo.service.PatientdetailsService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class PatientdetailsController {
       @Autowired
       PatientdetailsService ps;
       @Tag(name="Get",description="get data")
       @GetMapping("/ids")
       public List<Address> get()
       {
    	   return ps.getDetails();
       }
       
       @Tag(name="Post",description="post data")
       @PostMapping("/saved")
       public Address postDetails(@RequestBody Address id)
       {
    	   return ps.postDetails(id);
       }
       
}
