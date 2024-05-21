package com.suseol.iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        final BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("12문자 살인사건"));
        bookShelf.appendBook(new Book("용의자 X의 헌신"));
        bookShelf.appendBook(new Book("나미야 잡화점의 기적"));

        //명시적 Iterator 사용
        Iterator<Book> iterator = bookShelf.iterator();
        while(iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getName());
        }

        //향상된 for문 사용
        for(Book book : bookShelf) {
            System.out.println(book.getName());
        }
    }
}
