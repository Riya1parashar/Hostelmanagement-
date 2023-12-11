package com.User.Hostel.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Hostel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Hid;
    private String name;
    @OneToMany(mappedBy = "hostel")

    private List<Student> students;

}
