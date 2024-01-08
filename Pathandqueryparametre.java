package RESTASSURED.API;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.hamcrest.Matcher;
import org.testng.annotations.Test;
import io.restassured.RestAssured;


public class Pathandqueryparametre {
/*@Test(priority=1)
void Pathandqueryparamee() {
	given()
	.pathParam("my user","users")
	.queryParam("page", 2)
	.queryParam("id", 5).
	when().get("https://reqres.in/api/{my user}").
	then().log().all().statusCode(200);*/
	@Test(priority=2)
	void Abc() {
		given()
		.when().get("https://demoqa.com/BookStore/v1/Book?ISBN=9781449325862")
		.then().log().all();
	
}
}
