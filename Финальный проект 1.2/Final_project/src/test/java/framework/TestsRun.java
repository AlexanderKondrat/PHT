package framework;

import org.junit.runner.RunWith;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
        
        features = {"src/test/java/framework/Tests(VK).feature","src/test/java/framework/Tests(positive).feature","src/test/java/framework/Tests(negative).feature"})


public class TestsRun extends AbstractTestNGCucumberTests {
}
























