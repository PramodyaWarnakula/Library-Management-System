package com.pramodya.hfms.dto;

import java.sql.Date;

public class BorrowDTO {
    private Date dateBorrowed;
    private int id;
    private String bookid;
    private String title;
    private String author;
    private String studentid;
    private String studentname;
    private String studentcontact;
    private Date returndate;
    private Date extention;

    public BorrowDTO() {
    }

    public BorrowDTO(Date dateBorrowed, int id, String bookid, String title, String author, String studentid, String studentname, String studentcontact, Date returndate, Date extention) {
        this.dateBorrowed = dateBorrowed;
        this.id = id;
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.studentid = studentid;
        this.studentname = studentname;
        this.studentcontact = studentcontact;
        this.returndate = returndate;
        this.extention = extention;
    }

    public Date getDateBorrowed() {
        return dateBorrowed;
    }

    public void setDateBorrowed(Date dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentcontact() {
        return studentcontact;
    }

    public void setStudentcontact(String studentcontact) {
        this.studentcontact = studentcontact;
    }

    public Date getReturndate() {
        return returndate;
    }

    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }

    public Date getExtention() {
        return extention;
    }

    public void setExtention(Date extention) {
        this.extention = extention;
    }

    @Override
    public String toString() {
        return "BorrowDTO{" +
                "dateBorrowed=" + dateBorrowed +
                ", id=" + id +
                ", bookid='" + bookid + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", studentid='" + studentid + '\'' +
                ", studentname='" + studentname + '\'' +
                ", studentcontact='" + studentcontact + '\'' +
                ", returndate=" + returndate +
                ", extention=" + extention +
                '}';
    }
}
