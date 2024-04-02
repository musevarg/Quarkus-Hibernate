package org.acme;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Quote {

    @Id
    private Long id;

    private String quote;

    private String author;

}
