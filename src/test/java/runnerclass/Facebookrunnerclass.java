package runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\hp\\OneDrive\\Desktop\\java\\MyCucumberFw\\src\\test\\resources\\FeatureFiles\\Facebook.feature",glue = "stepdef")

public class Facebookrunnerclass {

}
