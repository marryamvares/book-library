package com.example.booklibrary.controller;

import com.example.booklibrary.model.Book;
import com.example.booklibrary.model.Category;
import com.example.booklibrary.model.Publisher;
import com.example.booklibrary.model.Users;
import com.example.booklibrary.service.BookService;
import com.example.booklibrary.service.CategoryService;
import com.example.booklibrary.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookService bookService;
    @Autowired
    PublisherService publisherService;
    @Autowired
    CategoryService categoryService;

    @GetMapping("")
    public List<Book> list() {
        return bookService.listAllBook();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> get(@PathVariable Integer id) {
        try {
            Book book = bookService.getBook(id);
            return new ResponseEntity<Book>(book, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody Book book) {
        Publisher p = publisherService.savePublisher(book.getPublisher());
        book.setPublisher(p);
        Category c=categoryService.saveCategory(book.getBookcategory());
        book.setBookcategory(c);
        bookService.saveBook(book);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Book book, @PathVariable Integer id) {
        try {
            Book existBook = bookService.getBook(id);
            book.setIdbook(id);
            bookService.saveBook(book);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        bookService.deleteBook(id);
    }
}
