package com.library.app;

import com.library.core.Book;

public class DigitalBook {



    public static void showDetails(Book book) {
        System.out.println("Title: " + book.title);
        //System.out.println("Author: " + book.author); //should give error cuz in different package
        //System.out.println("Pages: " + book.pages); //should give error cuz in different package
    }

}