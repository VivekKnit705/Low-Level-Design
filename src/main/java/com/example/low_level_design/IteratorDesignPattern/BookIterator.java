package com.example.low_level_design.IteratorDesignPattern;

import java.util.List;

public class BookIterator implements Iterator{

    List<Book> books;
    int index;

    public BookIterator(List<Book> books){
        this.books=books;
        index=0;
    }

    @Override
    public boolean hashNext() {
        return index<books.size();
    }

    @Override
    public Object next() {
        if(this.hashNext()){
            return books.get(index++);
        }
        return null;
    }
}
