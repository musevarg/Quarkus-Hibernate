package org.acme;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Quotes")
public class QuoteObject {

    public QuoteObject(){}

    public QuoteObject(Long id, String quote, String author){
        this.Id = id;
        this.Quote = quote;
        this.Author = author;
    }

    @Id
    private Long Id;

    private String Quote;

    private String Author;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getQuote() {
        return Quote;
    }

    public void setQuote(String quote) {
        this.Quote = quote;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

}
