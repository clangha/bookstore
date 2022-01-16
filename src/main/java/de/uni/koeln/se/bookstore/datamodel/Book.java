package de.uni.koeln.se.bookstore.datamodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String author;
    private Integer year;
    private Integer price;

    public Book(){}

    public Book(String name, String author, Integer year, Integer price){
        this.name = name;
        this.author = author;
        this.year = year;
        this.price = price;
    }
}
