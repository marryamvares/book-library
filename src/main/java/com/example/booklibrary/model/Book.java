package com.example.booklibrary.model;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    private Integer idbook;
    private String bookName;
    private String bookisbn;
    private Category bookcategory;
    private Integer bookCount;
    private Publisher publisher;

    public Book() {
    }

    public Book(Integer idbook, String bookName, String bookisbn, Category bookcategory, Integer bookCount,Publisher publisher) {
        this.idbook = idbook;
        this.bookName = bookName;
        this.bookisbn = bookisbn;
        this.bookcategory = bookcategory;
        this.bookCount = bookCount;
        this.publisher=publisher;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getIdbook() {
        return idbook;
    }

    public void setIdbook(Integer idbook) {
        this.idbook = idbook;
    }

    @Column
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Column
    public String getBookisbn() {
        return bookisbn;
    }

    public void setBookisbn(String bookisbn) {
        this.bookisbn = bookisbn;
    }

    @ManyToOne
    @JoinColumn
    public Category getBookcategory() {
        return bookcategory;
    }

    public void setBookcategory(Category bookcategory) {
        this.bookcategory = bookcategory;
    }

    @Column
    public Integer getBookCount() {
        return bookCount;
    }

    public void setBookCount(Integer bookCount) {
        this.bookCount = bookCount;
    }

    @ManyToOne
    @JoinColumn(name = "publisher_idpublisher", referencedColumnName = "idpublisher")
    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
