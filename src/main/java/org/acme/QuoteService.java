package org.acme;

import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

public class QuoteService {
    @Inject
    static EntityManager em;

    @Transactional
    public void createQuote(Long id, String quote, String author) {
        QuoteObject q = new QuoteObject();
        q.setId(id);
        q.setQuote(quote);
        q.setAuthor(author);
        em.persist(q);
    }
}
