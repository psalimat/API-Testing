
package MavenProject.MavenProject;


import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*; 
import static io.restassured.matcher.RestAssuredMatchers.*;
public class Test1 
{
	/*passing the parameters in the URI itself */
	@Test
  public void getResponseStatusCode() {
	  RestAssured.baseURI="https://newsapi.org/v2/sources?apiKey=ff7d197a68ee4d1d911eae747ce8c860&language=en&country=us";

	  Response response = given().when().get(RestAssured.baseURI) ;
	  int responseStatusCode = response.getStatusCode() ;
	  System.out.println(responseStatusCode);
	  Assert.assertEquals(200, responseStatusCode);
	//  return responseStatusCode ;
	  
  }

	/*passing the path parameters as language = english and country = us */	       
	@Test
	public void getResponseType() {
		 RestAssured.baseURI="https://newsapi.org/v2/sources";
		Response response = given().when().
				param("apiKey","ff7d197a68ee4d1d911eae747ce8c860").
				param("language","en").
				param("country","us").
				get(RestAssured.baseURI) ;
		String responseType = response.contentType() ;
		System.out.println(responseType);
	}
     /*Change the country code to india and verify if it is displaying the right result */
	@Test
	public void getLangaugeType() {
		 RestAssured.baseURI="https://newsapi.org/v2/sources?apiKey=ff7d197a68ee4d1d911eae747ce8c860";
		 Response response = given().when().param("language","en").
					param("country","in").
					get(RestAssured.baseURI) ;
			
			JsonPath responseJSON = response.jsonPath() ;
			
			System.out.println("OUtput "+ responseJSON.get("sources.id"));
	}
	
	
	
    }	


