import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RestAssured.baseURI= "http://34.243.128.248:8040/";
		
		given().log().all().header("Content-Type","application/json").body("{\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"string\",\r\n"
				+ "    \"details\": \"string\",\r\n"
				+ "    \"iconId\": 0,\r\n"
				+ "    \"iconName\": \"string\",\r\n"
				+ "    \"iconFontAwesomeCode\": \"string\",\r\n"
				+ "    \"activeFlag\": 0,\r\n"
				+ "    \"workingUnitId\": 0\r\n"
				+ "  }").when().get("Secretary-BE/api/setup/hospitality/search").then().log().all().assertThat().statusCode(403);
		
	
	}

}
