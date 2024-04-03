package org.acme;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class QuoteService {
    @Inject
    EntityManager em;

    @Transactional
    public QuoteObject getQuote(Long id) {
        String queryString = "SELECT Id, Quote, Author FROM QuoteObject WHERE Id=" + id;
        return em.createQuery(queryString, QuoteObject.class).getSingleResult();
    }

    @Transactional
    public void createQuote(Long id, String quote, String author) {
        QuoteObject q = new QuoteObject();
        q.setId(id);
        q.setQuote(quote);
        q.setAuthor(author);
        em.persist(q);
    }
}
