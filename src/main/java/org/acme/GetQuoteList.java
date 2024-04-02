package org.acme;

import jakarta.persistence.EntityManager;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("/quotes")
public class GetQuoteList {

    @Inject
    EntityManager entityManager;

    @GET
    public List<QuoteObject> getAllQuotes(){
        return entityManager.createQuery("SELECT Id, Quote, Author FROM QuoteObject", QuoteObject.class).getResultList();
    }

}
