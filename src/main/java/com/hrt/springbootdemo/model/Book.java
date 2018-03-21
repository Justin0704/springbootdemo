package com.hrt.springbootdemo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
/*@PropertySource(value= "book1.properties")
@ConfigurationProperties(prefix = "book")*/
public class Book {

    private String name1;
    private String author1;
    private Double price1;

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getAuthor1() {
        return author1;
    }

    public void setAuthor1(String author1) {
        this.author1 = author1;
    }

    public Double getPrice1() {
        return price1;
    }

    public void setPrice1(Double price1) {
        this.price1 = price1;
    }
}
