import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import files.payload;

public class Basics {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Validate if ADD place API is working as expected
		
		//given-->all input details
		//when-->submit the API
		//then-->validate the response
		
		//Add place-->To Update with new address-->Get Place to validate if new address is present in response
	RestAssured.baseURI= "https://rahulshettyacademy.com";
String response=given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").body(new String(Files.readAllBytes(Paths.get("C:\\Users\\Owner\\Documents\\addPlace.json")))).when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP"))
       .header("server","Apache/2.4.52 (Ubuntu)").extract().response().asString();
System.out.println(response);		
JsonPath js=new JsonPath(response);//for parsing Json
String placeId=js.getString("place_id");

System.out.println(placeId);
//update place
given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
.body("{\r\n"
		+ "    \"place_id\":\"f282b85df17682f122c6d9b750a45440\",\r\n"
		+ "    \"address\":\"70 Summer walk,USA\",\r\n"
		+ "    \"key\":\"qaclick123\"\r\n"
		+ "\r\n"
		+ "");
	}


}