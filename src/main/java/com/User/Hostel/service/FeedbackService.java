package com.User.Hostel.service;

import com.User.Hostel.entities.Feedback;
import com.User.Hostel.entities.Help;
import com.User.Hostel.repository.FeedbackRepo;
import com.User.Hostel.repository.HelpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {
    @Autowired
    private FeedbackRepo feedbackRepo;
    //create
    public Feedback createfeedback(Feedback saveData){
        Feedback feedbackData = new Feedback();
        feedbackData.setMessage(saveData.getMessage());
        Feedback dataSaved= this.feedbackRepo.save(feedbackData);
        return dataSaved;

    }
    //read
    public  Feedback feedbackById(long Sid){
        Feedback FeedbackData = this.feedbackRepo.findById(Sid).get();
        return FeedbackData;
    }
    //update
    public Feedback updateFeedback (long Sid, Feedback dataUpdate) {

        Feedback data = this.feedbackRepo.findById(Sid).get();

        Feedback newData = new Feedback();
        if (data.getMessage() != null) {

            newData.setSid(Sid);

            newData.setMessage(dataUpdate.getMessage());
            this.feedbackRepo.save(newData);

        } else {

            System.out.println("User with user id: " + Sid + " not found");

        }
        return newData;
    }
    //delete
    public void deleteHelp(long Sid){this.feedbackRepo.deleteById(Sid);
    }


}
