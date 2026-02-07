package com.example.low_level_design.IteratorDesignPattern;

public class Book {
    private int bookId;
    private String bookName;

    public Book(int bookId, String bookName){
        this.bookId=bookId;
        this.bookName=bookName;
    }

    public String toString(){
        return "BookId: "+this.bookId +  " BookName: "+this.bookName;
    }
}
