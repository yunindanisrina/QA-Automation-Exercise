package qaautomation.may2022;

import static org.testng.Assert.assertEquals;

import java.util.Locale;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIFaker  {
	
	
	@Test
	public void fakerTest() {
		Faker faker = new Faker(new Locale("ID"));
		String username = faker.name().username();
		String email = faker.internet().emailAddress();
//		String username = "lyman.keeling";
//		String email = "marietta.satterfield@hotmail.com";

		String password="1+1samadengan2";
		String phonenumber = "083445445656";
		

		RestAssured.baseURI="https://kolakproject.herokuapp.com";
		String payload = "{\r\n" + 
				"    \"username\":\""+username+"\",\r\n" + 
				"    \"password\":\"passwordsangatkuat\",\r\n" + 
				"    \"email\":\""+email+"\",\r\n" + 
				"    \"phonenumber\":\"083445445656\"\r\n" + 
				"}";
		System.out.println(payload);
		
		Response responseLogin = RestAssured.given().contentType("application/json").body(payload).when().post("/register");
		Response responseLogin2  = RestAssured.given().contentType("application/json").body(payload).when().post("/register");
		
		if(responseLogin.statusCode()==201) {
			username = responseLogin.jsonPath().get("username");
			assertEquals(responseLogin.statusCode(),201);
		  System.out.println(responseLogin.statusCode());
			if(responseLogin2.statusCode()==201) {
				username = responseLogin2.jsonPath().get("username");
				assertEquals(responseLogin2.statusCode(),201);
			  System.out.println(responseLogin2.statusCode());
		} else {
			String message = responseLogin2.jsonPath().get("message");
			System.out.println(message);
		}
	
      }
	}
}
