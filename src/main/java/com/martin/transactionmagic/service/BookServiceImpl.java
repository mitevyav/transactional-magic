package com.martin.transactionmagic.service;

import com.martin.transactionmagic.entity.Book;
import com.martin.transactionmagic.repository.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Transactional
    @Override
    public void updateBookById(Long id, Book book) {
        bookRepository.findById(id)
                .ifPresent(b -> {
                    b.setName(book.getName());
                    b.setAuthor(book.getAuthor());
                });
    }
}
