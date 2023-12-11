package com.User.Hostel.service;

import com.User.Hostel.entities.Student;
import com.User.Hostel.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    //create
    public Student createStudent(Student saveData){
        Student studentData = new Student();
        studentData.setFirstName(saveData.getFirstName());
        studentData.setLastName(saveData.getLastName());
     Student dataSaved= this.studentRepo.save(studentData);
        return dataSaved;

    }
    //read
    public Student teacherById(long Sid){
        Student studentData = this.studentRepo.findById(Sid).get();
        return studentData;
    }
    //update
    public Student updatestudent (long Sid, Student dataUpdate) {

        Student data = this.studentRepo.findById(Sid).get();

        Student newData = new Student();

        if (data.getFirstName() != null) {

            newData.setSid(Sid);

            newData.setFirstName(dataUpdate.getFirstName());

            newData.setLastName(dataUpdate.getLastName());
            this.studentRepo.save(newData);

        } else {

            System.out.println("User with user id: " + Sid + " not found");

        }

        return newData;
    }
    //delete
    public void deleteStudent(long Sid){
        this.studentRepo.deleteById(Sid);

    }
}
