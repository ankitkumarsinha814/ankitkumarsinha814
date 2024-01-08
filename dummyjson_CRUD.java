package RESTASSURED.API;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
public class dummyjson_CRUD {
	@Test(priority=1)
	void test1() {
		String A;
given().pathParam("A","products").
when().get( "https://dummyjson.com/{A}").
then().statusCode(200).log().all();
		}
	
	//@Test(priority=2)
	void test2() {
		String A;
		String B;
given().pathParam("A","products").
pathParam("B","add")
.body("{\r\n"
		+ "    \"message\": \"Product with id 'add' not found\"\r\n"
		+ "}").
when().post( "https://dummyjson.com/{A}/{B}").
then().statusCode(200).log().all();
		}
	
	//@Test(priority=3)
	void test3() {
		String A;
	String B;
given().pathParam("A","products")
.pathParam("B", "1")
.body("{\r\n"
		+ "    \"message\": \"10245\"\r\n"
		+ "}\r\n"
		+ "").
when().put( "https://dummyjson.com/{A}/{B}").
then().statusCode(200).log().all();
		}
	
	//@Test(priority=4)
	void test4() {
		String A;
	String B;
given().pathParam("A","products")
.pathParam("B", "1").

when().delete( "https://dummyjson.com/{A}/{B}").
then().statusCode(200).log().all();
		}
}
