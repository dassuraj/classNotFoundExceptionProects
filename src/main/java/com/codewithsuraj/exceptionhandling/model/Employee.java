package com.codewithsuraj.exceptionhandling.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * this class we are going to load using
 * class.forName("") but the name we are going to type wrong
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int id;
    private String name;
}
