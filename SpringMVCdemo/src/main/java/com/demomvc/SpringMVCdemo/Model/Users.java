package com.demomvc.SpringMVCdemo.Model;

import org.apache.catalina.User;

import java.util.List;

public class Users {
    private String username;

    private String password;

    private String email;

    private String gender;

    private String language;

    private List<String> system;

    public List<String> getSystem() {
        return system;
    }

    public void setSystem(List<String> system) {
        this.system = system;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Users(){

    }

    public Users(String username, String password, String email, String gender, String language, List<String> system) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.language = language;
        this.system = system;
    }

    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
