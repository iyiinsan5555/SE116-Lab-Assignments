package com.library.app;

import com.library.core.Book;
import com.library.app.DigitalBook;

public class MainJava {
    public static void main(String[] args) {
        Book book = new Book("Sir. Melih", "Just Melih", 55);

        DigitalBook.showDetails(book);
    }
}
