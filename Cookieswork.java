package RESTASSURED.API;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.json.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
public class Cookieswork {
	@Test
	void test1() {
		given().
		when().get("https://www.google.com/").
		then().statusCode(200).log().all();
	
	}

}
