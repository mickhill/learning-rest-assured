package baseClass;

import io.restassured.RestAssured;

public class BaseAPI {

	public void setUrlAPI(String url) {
		RestAssured.baseURI = url;
	}
}
