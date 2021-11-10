import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class ApiSuccess {

	@Test
	public void TestApiSuccess() {
		Response response = RestAssured.request(Method.GET, "https://reqres.in/api/users?page=2");
		//Assert.assertTrue(response.statusCode() == 200);
		Assert.assertEquals(200, response.statusCode());
	}
}
 