package restAssuredTests;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class PostRequestTest {
	HashMap<String,String>map=new HashMap();

	@BeforeClass
	public void postData()
	{
		map.put("id",RestUtils.getId());
		map.put("title", RestUtils.getTitle());
		map.put("body", RestUtils.getBody());
		map.put("userId", RestUtils.getuserId());
		System.out.println(map.get("title"));
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		RestAssured.basePath="/posts";
	}
	@Test
	public void testPost()
	{
		given()
			.contentType("application/json")
			.body(map)
.when()
	.post()

.then()
	
	.statusCode(201)
	//.and()
	//.body("title",equalTo("foo"))
	//.and()
	//.body("body",equalTo("bar"))
	.and()
	.contentType("application/json; charset=utf-8")
	//.and()
	//.header("Content-Length","67" )
	.and()
	.body(containsString(RestUtils.getTitle()))
	.body("body",containsString(RestUtils.getBody()))
	.body("title",equalTo(RestUtils.getTitle()));
	
	
		
	}
}
