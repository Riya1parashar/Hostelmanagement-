package com.User.Hostel.controller;

import com.User.Hostel.entities.Feedback;
import com.User.Hostel.entities.Help;
import com.User.Hostel.service.FeedbackService;
import com.User.Hostel.service.HelpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Feedback")
@CrossOrigin("*")

public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;
    //create
    @PostMapping("/create")

    public Feedback createfeedback(@RequestBody Feedback feedback){

        return this.feedbackService.createfeedback(feedback);

    }
    //read
    @GetMapping("/getFeedback/{Sid}")

    public Feedback getCustomerById(@PathVariable Long Sid) {

        return this.feedbackService.feedbackById(Sid);

    }
    //update

    @PutMapping("/update/(Sid}")

    public Feedback updatefeedback (@PathVariable Long Sid, @RequestBody Feedback feedback){

        return this.feedbackService.updateFeedback(Sid, feedback);

    }
    //delete

    @DeleteMapping("/delete/{Sid}")
    public void deleteFeedback(@PathVariable Long Sid){
      //  return this.feedbackService.deleteFeedback(Sid);
    }
}

