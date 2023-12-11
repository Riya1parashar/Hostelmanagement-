package com.User.Hostel.service;


import com.User.Hostel.entities.Warden;
import com.User.Hostel.repository.WardenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WardenService {

        @Autowired
        private WardenRepo wardenRepo;
        //create
        public Warden createwarden(Warden saveData){
            Warden wardenData = new Warden();
            wardenData.setUserName(saveData.getUserName());
            wardenData.setPassword(saveData.getPassword());
            Warden dataSaved= this.wardenRepo.save(wardenData);
            return dataSaved;

        }
        //read
        public Warden wardenById(long Sid){
            Warden wardenData = this.wardenRepo.findById(Sid).get();
            return wardenData;
        }
        //update
        public Warden updateWarden (long Sid, Warden dataUpdate) {

            Warden data = this.wardenRepo.findById(Sid).get();

       Warden newData = new Warden();

            if (data.getUserName() != null) {

                newData.setSid(Sid);

                newData.setUserName(dataUpdate.getUserName());

                newData.setPassword(dataUpdate.getPassword());
                this.wardenRepo.save(newData);

            } else {

                System.out.println("User with user id: " + Sid + " not found");

            }

            return newData;
        }
        //delete
        public void deleteTeacher(long Sid){
            this.wardenRepo.deleteById(Sid);
        }
    }

