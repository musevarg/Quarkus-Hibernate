package org.acme;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Quote {

    @Id
    private Long id;

    private String quote;

    private String author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
