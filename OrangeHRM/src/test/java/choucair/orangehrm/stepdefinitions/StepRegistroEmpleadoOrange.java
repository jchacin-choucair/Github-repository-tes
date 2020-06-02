package choucair.orangehrm.stepdefinitions;

import choucair.orangehrm.model.DatosRegistroEmpleadoOrangeHrm;
import choucair.orangehrm.questions.VerificarEmpleado;
import choucair.orangehrm.tasks.*;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;

public class StepRegistroEmpleadoOrange {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Jonathan necesita crear un empleado en el OrageHRM$")
    public void queJonathanNecesitaCrearUnEmpleadoEnElOrageHRM() {
             OnStage.theActorCalled("Jonathan").wasAbleTo(AbrirOrangeHrm.laPagina());
    }

    @Cuando("^realiza la identificacion al sistema$")
    public void realizaLaIdentificacionAlSistema() {
        OnStage.theActorInTheSpotlight().attemptsTo(RealizarIdentificacion.enOrange());
    }

    @Cuando("^el ingresa al menu PIM para agregar un empleado$")
    public void elIngresaAlMenuPIMParaAgregarUnEmpleado() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarAlMenu.elPIMAgregarEmpleado());
    }

    @Cuando("^el realiza el ingreso del registro en la aplicación$")
    public void elRealizaElIngresoDelRegistroEnLaAplicación(List<DatosRegistroEmpleadoOrangeHrm> datosEmpleado) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrarEmpleado.enOrangehrm(datosEmpleado.get(0)));
    }

    @Cuando("^el busca al nuevo (.*) registrado$")
    public void elBuscaAlNuevoEmpleadoRegistrado(String idEmpleadoRegistrado) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarEmpleadoRegistrado.nuevoEmpleado(idEmpleadoRegistrado));
    }

    @Entonces("^el visualiza el nuevo (.*) en el aplicativo$")
    public void elVisualizaElNuevoEmpleadoEnElAplicativo(String verificaEmpleado) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarEmpleado.empleadoRegistrado(verificaEmpleado)));
    }
}
