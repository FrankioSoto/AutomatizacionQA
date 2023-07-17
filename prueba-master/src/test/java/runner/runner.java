package runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
    @CucumberOptions(
            glue = "Steps",
            features = "src/test/resources/features",
            snippets= CucumberOptions.SnippetType.CAMELCASE, tags = "@Testzone", monochrome = true
    )

    public class runner {

    }


