package org.example.models;

import lombok.*;

@AllArgsConstructor // instead of constructor with parameters
@NoArgsConstructor  // constructor without parameters
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Student {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String currentAddress;

}
