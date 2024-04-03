package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GetQuoteListTest {

    @Test
    void testGetQuoteListEndpoint() {
        given()
                .when().get("/quotes")
                .then()
                .statusCode(200)
                .body(is("[{\"quote\":\"A kid once said to me asked me if I ever got hangovers. I said to get hangovers you have to stop drinking.\",\"author\":\"Lemmy Kilmister\",\"id\":1},{\"quote\":\"To defy the laws of tradition is a crusade only of the brave.\",\"author\":\"Les Claypool\",\"id\":2},{\"quote\":\"I am sick to death of people saying we have made 11 albums that sounds exactly the same. In fact, we have made 12 albums that sound exactly the same.\",\"author\":\"Angus Young\",\"id\":3},{\"quote\":\"You know, once you had that guitar up so loud on the stage, where you can lean back and volume will stop you from falling backward, that is a hard drug to kick.\",\"author\":\"David Gilmour\",\"id\":4},{\"quote\":\"A cookie has no soul, it is just a cookie. But before it was milk and eggs. And in eggs is the potential for life.\",\"author\":\"Jean-Claude Van Damme\",\"id\":5}]"));
    }

}
