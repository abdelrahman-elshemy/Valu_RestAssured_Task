package Valu;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Valu_Check_Response {
    @org.testng.annotations.Test
    public void validate_response_body() {

        given().
                baseUri("https://api.agify.io/").
                when().
                get("/?name=meelad").
                then().
                assertThat().
                statusCode(200).
                body("count", equalTo(21),
                        "name", equalTo("meelad"),
                        "age", equalTo(34)
                );

    }
}
