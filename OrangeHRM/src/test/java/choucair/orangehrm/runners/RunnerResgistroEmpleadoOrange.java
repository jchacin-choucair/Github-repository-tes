package choucair.orangehrm.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registro_empleado_orangehrm.feature",
        tags = "@RegistroEmpleadoOrange",
        glue = "choucair.orangehrm.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerResgistroEmpleadoOrange {
}
