package com.example.low_level_design.IteratorDesignPattern;

import java.util.List;

public class Library {

    List<Book> books;

    public Library(List<Book> books){
        this.books=books;
    }

    public Iterator createIterator(){
        return new BookIterator(this.books);
    }
}
