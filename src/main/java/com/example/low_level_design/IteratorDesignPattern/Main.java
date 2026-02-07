package com.example.low_level_design.IteratorDesignPattern;

import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Book> bookList= List.of(new Book(1, "Math"), new Book(2, "Hindi"), new Book(3, "English"), new Book(4, "Science"));
        Library library=new Library(bookList);
        Iterator iterator=library.createIterator();

        while(iterator.hashNext()){
            Book book= (Book) iterator.next();
            System.out.println(book.toString());
        }
    }
}
