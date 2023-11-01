package com.ourvirtualmarket.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/ourvirtualmarket/stepDefs",
        plugin = {
                "json:target/cucumber.json",
                "html:target/default-html-reports.html"
        },
        dryRun = false,
        tags = "@logout3"
)
public class CukesRunner {
}
