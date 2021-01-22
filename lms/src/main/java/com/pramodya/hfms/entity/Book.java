package com.pramodya.hfms.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Book extends SuperEntity {


    @Id
    private String bookid;
    private String title;
    private String author;
    private String publishyear;
    private String catogery;
    private String isbn;
    private String edition;
    private String booktype;
    private String publication;
    private String notes;

    public Book() {
    }

    public Book(String bookid, String title, String author, String publishyear, String catogery, String isbn, String edition, String booktype, String publication, String notes) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.publishyear = publishyear;
        this.catogery = catogery;
        this.isbn = isbn;
        this.edition = edition;
        this.booktype = booktype;
        this.publication = publication;
        this.notes = notes;
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

    public String getPublishyear() {
        return publishyear;
    }

    public void setPublishyear(String publishyear) {
        this.publishyear = publishyear;
    }

    public String getCatogery() {
        return catogery;
    }

    public void setCatogery(String catogery) {
        this.catogery = catogery;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid='" + bookid + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishyear='" + publishyear + '\'' +
                ", catogery='" + catogery + '\'' +
                ", isbn='" + isbn + '\'' +
                ", edition='" + edition + '\'' +
                ", booktype='" + booktype + '\'' +
                ", publication='" + publication + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
