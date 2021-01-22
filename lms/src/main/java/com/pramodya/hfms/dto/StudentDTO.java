package com.pramodya.hfms.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class StudentDTO {
    private String studentid;
    private String firstame;
    private String lastname;
    private int contactnumber;
    private String email;
    private String course;
    private String batch;

    public StudentDTO() {
    }

    public StudentDTO(String studentid, String firstame, String lastname, int contactnumber, String email, String course, String batch) {
        this.studentid = studentid;
        this.firstame = firstame;
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

    public String getFirstame() {
        return firstame;
    }

    public void setFirstame(String firstame) {
        this.firstame = firstame;
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
        return "StudentDTO{" +
                "studentid='" + studentid + '\'' +
                ", firstame='" + firstame + '\'' +
                ", lastname='" + lastname + '\'' +
                ", contactnumber=" + contactnumber +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                ", batch='" + batch + '\'' +
                '}';
    }
}
