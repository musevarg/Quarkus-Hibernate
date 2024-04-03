package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class SingleQuoteTest {

    @Test
    void testGetQuoteListEndpoint() {
        given()
                .when().get("/quote/2")
                .then()
                .statusCode(200)
                .body(is("{\"quote\":\"To defy the laws of tradition is a crusade only of the brave.\",\"author\":\"Les Claypool\",\"id\":2}"));
    }

}
