package com.shaon.jwtdemo.model;

import lombok.Data;

@Data
public class LoginRequestModel {

    private String email;
    private String password;
}
