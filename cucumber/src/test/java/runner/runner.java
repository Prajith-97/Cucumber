package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\JavaIntellij\\cucumber\\src\\test\\resources\\features\\loginDataTable.feature",
        glue={"stepdefs"})

public class runner {


}
