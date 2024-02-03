/*
    Assignment 03

    Response.java

    Group 1: Nicholas Boyle, Shawntraree Lucas
 */

package com.example.assignment03;

import java.io.Serializable;

public class Response implements Serializable {
    String name;
    String email;
    String role;

    String income;

    String education;

    String maritalStatus;

    String livingStatus;


    public Response(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.income = income;
        this.education = education;
        this.maritalStatus = maritalStatus;
        this.livingStatus = livingStatus;
    }
}