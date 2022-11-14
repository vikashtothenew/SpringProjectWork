package com.bootcamp.project.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String email;
    private String password;

    //TO ADD - GETTERS AND SETTERS

    private String first_name;
    private String middle_name;
    private String last_name;
    private boolean is_deleted;
    private boolean is_active;
    private boolean is_expired;
    private boolean is_locked;
    private Date password_update_date;
    private int invalid_attempt_count;

}
