package autoamericanas;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions (features = "src/test/java/Americanas.feature", glue = {""}, monochrome = true)

public class ClassTest {

}
