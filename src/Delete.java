import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RestAssured.baseURI= "http://34.243.128.248:8040/";
		
		given().log().all().with().pathParam("id", 5).header("Content-Type","application/json").
			when().delete("Secretary-BE/api/setup/hospitality/{id}").then().log().all().assertThat().statusCode(403);
		
	
	
	}

}
