package RESTASSURED.API;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.hamcrest.Matcher;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
public class ReqresCRUD {
	@Test(priority=1)
	void get1() {
		RestAssured.baseURI ="https://reqres.in//api/users?page=2";
		given().
		when().get().
		then().log().all().statusCode(200)
		.log().all().header("Transfer-Encoding","chunked")
		.log().all().header("Content-Type","application/json; charset=utf-8");
	}
	@Test(priority=2)
	void post1() {
		RestAssured.baseURI ="https://reqres.in/api/user/";
		given().log().all().body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}")
		.when().post()
		.then().statusCode(201)
		.body("name",equalTo("morpheus"))
		.body("job",equalTo("leader"))
		.header("Content-Type", "application/json; charset=utf-8")
		.log().all();
		}
	
	@Test(priority=3)
	void put1() {
		RestAssured.baseURI ="https://reqres.in/api/user/";
		given().log().all().body("{\r\n"
				+ "    \"name\": \"Ankit\",\r\n"
				+ "    \"job\": \"QA\"\r\n"
				+ "}")
		.when().put()
		.then().log().all().statusCode(200)
		.body("name",equalTo("Ankit"))
		.body("job",equalTo("QA"));
		}
	@Test(priority=4)
	void delete1() {
		RestAssured.baseURI ="https://reqres.in/api/user/";
		given().log().all()
		.when().delete()
		.then().log().all().statusCode(204);
		}
}