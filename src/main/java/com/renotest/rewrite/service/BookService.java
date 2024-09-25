package com.renotest.rewrite.service;

import com.renotest.rewrite.domain.Book;

public interface BookService {
    public Book getBook(long id);

    public long addBook(Book book);

    public long getBookCount();
}
