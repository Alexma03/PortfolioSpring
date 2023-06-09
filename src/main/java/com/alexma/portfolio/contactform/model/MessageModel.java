package com.alexma.portfolio.contactform.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class MessageModel {
    @Id
    private Date date;
    private String name;
    private String email;
    @Column(length = 20000)
    private String message;

    public MessageModel(Date date, String name, String email, String message) {
        this.date = date;
        this.name = name;
        this.email = email;
        this.message = message;
    }

    public MessageModel() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
