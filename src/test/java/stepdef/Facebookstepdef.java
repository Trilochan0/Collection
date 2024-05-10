package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;

public class Facebookstepdef {
	public WebDriver driver;
	String actT;
	@Given("Browser should open app should launch")
	public void browser_should_open_app_should_launch() {
	   driver= new EdgeDriver();
	   driver.get("https://www.facebook.com");
	}

	@When("User captures Title  of facebook page")
	public void user_captures_title_of_facebook_page() {
		actT=driver.getTitle();
	  
	}

	@Then("Expected and Actual Title should match")
	public void expected_and_actual_title_should_match() {
		if(actT.contains("Facbook")) {
			System.out.println("TC IS PASS");
		}
		else {
			System.out.println("TC IS FAIL");
	   
	}




	}
}