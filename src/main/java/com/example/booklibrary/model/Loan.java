package com.example.booklibrary.model;

import javax.persistence.*;

@Entity
@Table(name = "loan")
public class Loan {
    private Integer loanid;
    private Book book;
    private Users user;

    public Loan() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getLoanid() {
        return loanid;
    }

    public void setLoanid(Integer loanid) {
        this.loanid = loanid;
    }

    @ManyToOne
    @JoinColumn(name = "bookid",foreignKey=@ForeignKey(name = "book_id"))
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @ManyToOne
    @JoinColumn(name = "userid",foreignKey=@ForeignKey(name = "user_id"))
    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
