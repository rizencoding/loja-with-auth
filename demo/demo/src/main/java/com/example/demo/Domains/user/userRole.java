package com.example.demo.Domains.user;

public enum userRole {
    ADMIN("admin"),

    USER("user");

    private String role;

    userRole(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}
