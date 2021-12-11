package StepRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/main/java/FeatureFile"}, glue= {"StepDef"}, monochrome=true)

public class fbsteprunner {
	
}