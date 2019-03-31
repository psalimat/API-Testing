package MavenProject.MavenProject;
//import static org.hamcrest.CoreMatchers.equalsTo;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*; 
import static io.restassured.matcher.RestAssuredMatchers.*;
public class App 
{
    public static void main( String[] args )
    {

RestAssured.baseURI="https://newsapi.org/v2/sources?apiKey=ff7d197a68ee4d1d911eae747ce8c860";

//https://newsapi.org/v2/sources?apiKey=ff7d197a68ee4d1d911eae747ce8c860


    
    given().param("key","ff7d197a68ee4d1d911eae747ce8c860") ;
    



	
 RequestSpecification request = RestAssured.given();
	
	 
	 
	 
	 
	 
	 Response response = request.get();
	 System.out.println("Status code: " + response.getStatusCode());
 System.out.println("Status message " + response.body().asString());
	}
		       
		      
    }
    


