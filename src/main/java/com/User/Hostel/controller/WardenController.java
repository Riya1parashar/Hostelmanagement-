package com.User.Hostel.controller;

import com.User.Hostel.entities.Warden;
import com.User.Hostel.service.WardenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Warden")
@CrossOrigin("*")

public class WardenController {
    @Autowired
    private WardenService wardenService;
    //create
    @PostMapping("/create")

    public Warden createWarden(@RequestBody Warden warden ){

        return this.wardenService.createwarden(warden);

    }
    //read
    @GetMapping("/getWarden/{Sid}")

    public Warden getCustomerById(@PathVariable Long Sid) {

        return this.wardenService.wardenById(Sid);

    }
    //update

    @PutMapping("/update/(Sid}")

    public Warden updateWarden (@PathVariable Long Sid, @RequestBody Warden warden){

        return this.wardenService.updateWarden (Sid, warden);

    }
    //delete

    @DeleteMapping("/delete/{Sid}")
    public void deleteWarden(@PathVariable Long Sid){
     //   return this.wardenService.deleteWarden(Sid);


    }
}


