package com.techprimers.testing;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/FizzBuzz.feature",
        glue = "com.techprimers.testing",
        plugin = {"json:target/cucumber.json"}
)
public class CucumberTest {
}
