import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI= "http://34.243.128.248:8040/";
		
		given().with().pathParam("pageIndex",5).pathParam("pageSize",33).log().all().header("Content-Type","application/json").body("{\r\n"
				+ "  \"totalPages\": 0,\r\n"
				+ "  \"totalElements\": 0,\r\n"
				+ "  \"sort\": {\r\n"
				+ "    \"sorted\": true,\r\n"
				+ "    \"unsorted\": true,\r\n"
				+ "    \"empty\": true\r\n"
				+ "  },\r\n"
				+ "  \"first\": true,\r\n"
				+ "  \"last\": true,\r\n"
				+ "  \"numberOfElements\": 0,\r\n"
				+ "  \"pageable\": {\r\n"
				+ "    \"sort\": {\r\n"
				+ "      \"sorted\": true,\r\n"
				+ "      \"unsorted\": true,\r\n"
				+ "      \"empty\": true\r\n"
				+ "    },\r\n"
				+ "    \"paged\": true,\r\n"
				+ "    \"pageSize\": 0,\r\n"
				+ "    \"pageNumber\": 0,\r\n"
				+ "    \"unpaged\": true,\r\n"
				+ "    \"offset\": 0\r\n"
				+ "  },\r\n"
				+ "  \"size\": 0,\r\n"
				+ "  \"content\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\",\r\n"
				+ "      \"details\": \"string\",\r\n"
				+ "      \"iconId\": 0,\r\n"
				+ "      \"iconName\": \"string\",\r\n"
				+ "      \"iconFontAwesomeCode\": \"string\",\r\n"
				+ "      \"activeFlag\": 0,\r\n"
				+ "      \"workingUnitId\": 0\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"number\": 0,\r\n"
				+ "  \"empty\": true\r\n"
				+ "}").when().post("Secretary-BE/api/setup/hospitality/{pageIndex}/{pageSize}").then().log().all().assertThat().statusCode(403);
		
	}

}

