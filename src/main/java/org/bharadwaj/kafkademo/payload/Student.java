package org.bharadwaj.kafkademo.payload;


import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int id;
    private String firstname;
    private String lastname;
}
