package Runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Shohagh\\workspace\\FreeCRMBDD\\src\\main\\java\\Features"
,glue={"stepDefenition"}
)

public class RunnerClass {
	
	
	

}
