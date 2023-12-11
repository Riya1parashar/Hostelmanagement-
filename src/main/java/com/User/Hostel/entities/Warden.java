package com.User.Hostel.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Warden")

public class Warden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Sid;
    private String UserName;
    private String Password;
}
