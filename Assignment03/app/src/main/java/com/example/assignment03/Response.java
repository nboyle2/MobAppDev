package com.example.assignment03;

import java.io.Serializable;

public class Response implements Serializable {
    String name;
    String email;
    String role;

    public Response(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }
}
