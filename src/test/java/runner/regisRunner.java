package runner;

import core.seleniumConfig;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            glue = {"stepdefinition"},
            plugin = {"pretty", "html:target/cucumber/report.html","json:target/cucumber/report.json"},
            tags = "@positive",
            features = {"src/test/java/feature"})

    public class regisRunner {
        @BeforeClass
        public static void seleniumInitialization(){ seleniumConfig.initConfiguration();
        }
    }
