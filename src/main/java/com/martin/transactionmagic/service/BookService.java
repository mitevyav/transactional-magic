package com.martin.transactionmagic.service;

import com.martin.transactionmagic.entity.Book;

public interface BookService {

    void updateBookById(Long id, Book book);
}
