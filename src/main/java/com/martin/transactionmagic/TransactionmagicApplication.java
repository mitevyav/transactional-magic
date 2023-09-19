package com.martin.transactionmagic;

import com.martin.transactionmagic.entity.Book;
import com.martin.transactionmagic.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransactionmagicApplication implements CommandLineRunner {

    @Autowired
    private BookServiceImpl bookService;

    public static void main(String[] args) {
        SpringApplication.run(TransactionmagicApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Book harryPotter = new Book("Harry Potter", "J.K. Rowling");
        bookService.updateBookById(1L, harryPotter);
    }
}
