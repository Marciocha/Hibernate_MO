package com.sdajava.hibernate.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created by lukas on 25.04.2017.
 */
@Entity
@Table(name = "books", schema = "ksiegarnia")
public class BooksEntity {
    private String title;
    private String author;
    private Date published;
    private String isbn;
    private String category;
    private Integer page_count;
    private String publisher;
    private BigDecimal price;
    private Integer on_stock;
    private int id;


    @Column(name = "title", nullable = true, length = 128)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Column(name = "author", nullable = true, length = 128)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Column(name = "published", nullable = true)
    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }


    @Column(name = "isbn", nullable = true, length = 17)
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    @Column(name = "category", nullable = true, length = 128)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @Column(name = "page_count", nullable = true)
    public Integer getPage_count() {
        return page_count;
    }

    public void setPage_count(Integer page_count) {
        this.page_count = page_count;
    }


    @Column(name = "publisher", nullable = true, length = 128)
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    @Column(name = "price", nullable = true, precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    @Column(name = "on_stock", nullable = true)
    public Integer getOn_stock() {
        return on_stock;
    }

    public void setOn_stock(Integer on_stock) {
        this.on_stock = on_stock;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


