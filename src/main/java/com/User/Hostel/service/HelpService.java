package com.User.Hostel.service;

import com.User.Hostel.entities.Help;
import com.User.Hostel.repository.HelpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class HelpService {
    @Autowired
    private HelpRepo helpRepo;
    //create
    public Help createhelp(Help saveData){
        Help helpData = new Help();
        helpData.setTopic(saveData.getTopic());
        helpData.setDescription(saveData.getDescription());
        Help dataSaved= this.helpRepo.save(helpData);
        return dataSaved;

    }
    //read
    public Help helpById(long Sid){
       Help HelpData = this.helpRepo.findById(Sid).get();
        return HelpData;
    }
    //update
    public Help updateHelp (long Sid, Help dataUpdate) {

        Help data = this.helpRepo.findById(Sid).get();

        Help newData = new Help();

        if (data.getTopic() != null) {

            newData.setSid(Sid);

            newData.setTopic(dataUpdate.getTopic());

            newData.setDescription(dataUpdate.getDescription());
            this.helpRepo.save(newData);

        } else {

            System.out.println("User with user id: " + Sid + " not found");

        }

        return newData;
    }
    //delete
    public void deleteHelp(long Sid){
        this.helpRepo.deleteById(Sid);
    }
}


