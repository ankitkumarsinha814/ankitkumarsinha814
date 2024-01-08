package RESTASSURED.API;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class Postusingjsonlibrary {
	@Test(priority=1)
			void postusingjsonlibrary() {
		JSONObject data= new JSONObject();
		data.put("name", "morpheus");
		data.put("job", "leader");
		given().log().all().body(data)
		.when()
		.post("https://reqres.in/api/users/")
		.then()
		.log().all().statusCode(201);
	}

}

