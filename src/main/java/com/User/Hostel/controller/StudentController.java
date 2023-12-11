package com.User.Hostel.controller;

import com.User.Hostel.entities.Student;
import com.User.Hostel.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Student")
@CrossOrigin("*")

public class StudentController {
    @Autowired
    private StudentService studentService;
    //create
    @PostMapping("/create")

    public Student createStudent (@RequestBody Student student){

        return this.studentService.createStudent(student);

    }
   // read
  @GetMapping("/getStudent/{Sid}")

    public Student getCustomerById(@PathVariable Long Sid) {

      return null;
  }

    //update

    @PutMapping("/update/{Sid}")

    public Student updateStudent (@PathVariable Long Sid, @RequestBody Student student){

        return this.studentService.updatestudent (Sid, student);

    }
    //delete

    @DeleteMapping("/delete/{Sid}")
    public void deleteStudent(@PathVariable Long Sid){
    this.studentService.deleteStudent(Sid);


    }
}
