package pa.com.choucair.certification.proyectobase.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.choucair.certification.proyectobase.model.LoginData;
import pa.com.choucair.certification.proyectobase.questions.VerificarNombreCurso;
import pa.com.choucair.certification.proyectobase.tasks.*;

import java.util.List;

public class StepsCursos {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }


    @Dado("^que Jonathan ingresa a la pagina de Academy Choucair$")
    public void queJonathanIngresaALaPaginaDeAcademyChoucair() {
        OnStage.theActorCalled("Jonathan").wasAbleTo(OpenUp.thePage());
    }

    @Dado("^ingresa usuario y contraseña en el formulario de acceso$")
    public void ingresaUsuarioYContraseñaEnElFormularioDeAcceso(List<LoginData> loginData) {
        OnStage.theActorCalled("Jonathan").wasAbleTo(Login.onThePage(loginData.get(0)));
    }

    @Cuando("^ingresa a la categoria de (.*)$")
    public void ingresaALaCategoriaDeCursosYCertificaciones (String categoria){
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarCategoria.deEstudio(categoria));
    }

    @Cuando("^ingresa usuario y contraseña con Sikuli en el formulario de acceso$")
    public void ingresaUsuarioYContraseñaConSikuliEnElFormularioDeAcceso() {
        OnStage.theActorInTheSpotlight().attemptsTo(IniciarSesion.conSikuli());

    }

    @Cuando("^busca el curso (.*)$")
    public void buscaElCursoTutorialNivelBásico(String curso) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarCurso.elCurso(curso));
    }

    @Entonces("^verifica que el curso encontrado corresponde a (.*)$")
    public void verificaQueElCursoEncontradoCorrespondeATutorialNivelBásico(String preguntaCurso) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarNombreCurso.toThe(preguntaCurso)));
    }

    @Entonces("^verifica el inicio de la Sesion$")
    public void verificaElInicioDeLaSesion() {

    }
}
