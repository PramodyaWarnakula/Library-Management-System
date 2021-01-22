package com.pramodya.hfms.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Student extends SuperEntity{

    @Id
    private String studentid;
    private String firstname;
    private String lastname;
    private int contactnumber;
    private String email;
    private String course;
    private String batch;

    public Student() {
    }

    public Student(String studentid, String firstname, String lastname, int contactnumber, String email, String course, String batch) {
        this.studentid = studentid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.contactnumber = contactnumber;
        this.email = email;
        this.course = course;
        this.batch = batch;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(int contactnumber) {
        this.contactnumber = contactnumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid='" + studentid + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", contactnumber=" + contactnumber +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                ", batch='" + batch + '\'' +
                '}';
    }
}
