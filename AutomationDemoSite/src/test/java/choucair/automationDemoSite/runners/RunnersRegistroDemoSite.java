package choucair.automationDemoSite.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registro_demo_site.feature",
        tags = "@RegistroDemoSite",
        glue = "choucair.automationDemoSite.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnersRegistroDemoSite {
}
