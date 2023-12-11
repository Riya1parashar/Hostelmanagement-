package com.User.Hostel.controller;

import com.User.Hostel.entities.Help;
import com.User.Hostel.service.HelpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Help")
@CrossOrigin("*")

public class HelpController {
    @Autowired
    private HelpService helpService;
    //create
    @PostMapping("/create")

    public Help createHelp(@RequestBody Help help){

        return this.helpService.createhelp(help);

    }
    //read
    @GetMapping("/getHelp/{Sid}")

    public Help getCustomerById(@PathVariable Long Sid) {

        return this.helpService.helpById(Sid);

    }
    //update

    @PutMapping("/update/(Sid}")

    public Help updatehelp (@PathVariable Long Sid, @RequestBody Help help){

        return this.helpService.updateHelp (Sid, help);

    }
    //delete

    @DeleteMapping("/delete/{Sid}")
    public void deleteHelp(@PathVariable Long Sid){
     //   return this.helpService.deleteHelp(Sid);
    }
}
