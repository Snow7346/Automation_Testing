package globalRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/features/loginPage.feature"},
				glue={"stepsDefinition"},
				publish=true)
public class globalRunner {

	
}
