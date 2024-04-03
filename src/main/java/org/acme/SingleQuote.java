package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
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

}
