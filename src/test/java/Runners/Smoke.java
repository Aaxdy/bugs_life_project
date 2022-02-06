package Runners;

import io.cucumber.java.an.Cuan;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "steps",
        dryRun = false,
        monochrome = true,

        tags = "@batch11",
        plugin = {"pretty", "html:target/cucumber.html", json:target/cucumber.json"
        "rerun:target/failed.txt"
        }
)
public class Smoke {
}
