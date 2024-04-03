package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/quote")
public class SingleQuote {

    @Inject
    QuoteService service;

    @GET
    @Path("/{quoteId}")
    public QuoteObject getSingleQuote(Long quoteId) {
        return service.getQuote(quoteId);
    }

    @POST
    public QuoteObject postNewQuote(QuoteObject quote){
        return service.createQuote(quote);
    }

}
