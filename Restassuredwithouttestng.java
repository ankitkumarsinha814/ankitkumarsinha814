package RESTASSURED.API;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.hamcrest.Matcher;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
public class Restassuredwithouttestng {

	public static void main(String[] args) {
		given()
		.when().get("https://demoqa.com/BookStore/v1/Book?ISBN=9781449325862")
		.then().log().all();
	

	}

}
