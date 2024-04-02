package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/quotes")
public class GetQuoteList {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public List<Quote> getAllQuotes(){
        return QuoteService.em.createQuery("SELECT Id, Quote, Author FROM Quotes", Quote.class).getResultList();
    }

}
