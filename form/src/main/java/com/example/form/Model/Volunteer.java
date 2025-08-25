package com.example.form.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Volunteer {
    private String name;
    private String emailAddress ;
    private String phoneNumber;
    private String event;
}
