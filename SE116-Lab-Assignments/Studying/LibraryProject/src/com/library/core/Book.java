package com.library.core;

public class Book{
    public String title;
    protected String author;
    int pages; //this is Default access-modifier, only accessible from same page classes

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

}
