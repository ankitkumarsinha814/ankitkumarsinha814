package RESTASSURED.API;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class AllAuthentication {
@Test(priority=1)
	void basic()
	{
	given().auth().basic("postman", "password")
	.when()
	.get("https://postman-echo.com/basic-auth")
	.then().log().all().
	statusCode(200)
 .body("authenticated",equalTo(true));}
	
	@Test(priority=2)
	void digest()
	{
		given().auth().digest("postman", "password")
	.when()
	.get("https://postman-echo.com/basic-auth")
	.then().log().all().
	statusCode(200)
 .body("authenticated",equalTo(true));}
	
	@Test(priority=3)
	void preemtive()
	{
		given().auth().preemptive().basic("postman", "password")
	.when()
	.get("https://postman-echo.com/basic-auth")
	.then().log().all().
	statusCode(200)
 .body("authenticated",equalTo(true));}
	@Test(priority=4)
	void Bearer(){
		String Bear="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";
		given().
		header("Autherization","Bearer "+Bear)
		.when()
		.get("https://api.github.com/")
		.then()
		.statusCode(200)
		.log().all();
	}
	@Test(priority=5)
	void Oauth2(){
		String Bear="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";
		given().auth().oauth2(Bear)		
        .when()
		.get("https://api.github.com/")
		.then()
		.statusCode(200)
		.log().all();
	}
	@Test(priority=6)
	void APIKEYS(){
		given().queryParam("appid","fe9c5cddb7e01d747b4611c3fc9eaf2c")
        .when()
		.get("api.openweathermap.org/data/2.5/forecast/daily?q=Delhi&units=metric&cnt=7")
		.then()
		.statusCode(200)
		.log().all();
	}
}

