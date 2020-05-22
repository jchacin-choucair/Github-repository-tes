package pa.com.choucair.certification.proyectobase.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/cursos_choucair_academy.feature",
        tags = "@IniciarSesionSikuli",
        glue = "pa.com.choucair.certification.proyectobase.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerCursosChoucair {

}
