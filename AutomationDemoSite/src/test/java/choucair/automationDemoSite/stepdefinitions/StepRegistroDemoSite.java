package choucair.automationDemoSite.stepdefinitions;

import choucair.automationDemoSite.model.DatosRegistroDemoSite;
import choucair.automationDemoSite.questions.VerificarRegistro;
import choucair.automationDemoSite.tasks.AbrirDemoSite;
import choucair.automationDemoSite.tasks.RealizarRegistro;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class StepRegistroDemoSite {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }


    @Dado("^que Jonathan quiere acceder a la Web Automation Demo Site$")
    public void queJonathanQuiereAccederALaWebAutomationDemoSite() {
        OnStage.theActorCalled("Jonathan").wasAbleTo(AbrirDemoSite.laPagina());

    }

    @Cuando("^el realiza el registro en la página$")
    public void elRealizaElRegistroEnLaPágina(List<DatosRegistroDemoSite> datosRegistro) {
        OnStage.theActorInTheSpotlight().attemptsTo(RealizarRegistro.enDemoSite(datosRegistro.get(0)));
    }

    @Entonces("^el verifica que se carga la pantalla con texto (.*)$")
    public void elVerificaQueSeCargaLaPantallaConTextoDoubleDoubleClickOnEditIconToEDITTheTableRow(String textoVerificar) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarRegistro.deFormulario(textoVerificar)));
    }

}
