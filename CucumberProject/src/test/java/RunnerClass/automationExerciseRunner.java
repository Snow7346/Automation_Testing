package RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/features/GoogleLinks.feature",glue= "stepDefinitions",
                tags="@Images")
public class automationExerciseRunner {

}
