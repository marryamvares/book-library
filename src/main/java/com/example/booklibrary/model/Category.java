package com.example.booklibrary.model;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    private Integer idcategory;
    private String categoryname;

    public Category() {
    }

    public Category(Integer idcategory, String categoryname) {
        this.idcategory = idcategory;
        this.categoryname = categoryname;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getIdcategory() {
        return idcategory;
    }

    public void setIdcategory(Integer idcategory) {
        this.idcategory = idcategory;
    }

    @Column
    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }
}
