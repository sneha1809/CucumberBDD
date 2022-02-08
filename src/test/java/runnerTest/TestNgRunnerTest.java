package runnerTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
dryRun = false,		
features="src/test/java/Features",
glue    ={"StepDefinations","Hooks"},
plugin = { "pretty", "html:target/cucumber-reports" },
monochrome = true
)
public class TestNgRunnerTest extends AbstractTestNGCucumberTests {

}
