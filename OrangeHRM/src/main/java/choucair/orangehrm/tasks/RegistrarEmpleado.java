package choucair.orangehrm.tasks;

import choucair.orangehrm.model.DatosRegistroEmpleadoOrangeHrm;
import choucair.orangehrm.userinterface.RegistroEmpleadoUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class RegistrarEmpleado implements Task {

    private DatosRegistroEmpleadoOrangeHrm datosRegistroEmpleadoOrangeHrm;

    public RegistrarEmpleado(DatosRegistroEmpleadoOrangeHrm datosRegistroEmpleadoOrangeHrm) {
        this.datosRegistroEmpleadoOrangeHrm = datosRegistroEmpleadoOrangeHrm;
    }

    public static RegistrarEmpleado enOrangehrm(DatosRegistroEmpleadoOrangeHrm datosRegistroEmpleadoOrangeHrm) {

        return Tasks.instrumented(RegistrarEmpleado.class,datosRegistroEmpleadoOrangeHrm);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(RegistroEmpleadoUserInterface.FORMULARIO_EMPLEADO,isVisible()));

        actor.attemptsTo(Enter.theValue(datosRegistroEmpleadoOrangeHrm.getPrimerNombre())
                .into(RegistroEmpleadoUserInterface.INPUT_PRIMER_NOMBRE));

        actor.attemptsTo(Enter.theValue(datosRegistroEmpleadoOrangeHrm.getSegundoNombre())
                .into(RegistroEmpleadoUserInterface.INPUT_SEGUNDO_NOMBRE));

        actor.attemptsTo(Enter.theValue(datosRegistroEmpleadoOrangeHrm.getApellido())
                .into(RegistroEmpleadoUserInterface.INPUT_APELLIDO));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.INPUT_MUESTRA_UBICACION));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.SPAN_SELECCIONA_UBICACION.getCssOrXPathSelector()
                .replace("$ubicacion",datosRegistroEmpleadoOrangeHrm.getUbicacion())));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.BOTON_NEXT));

        actor.attemptsTo(WaitUntil.the(RegistroEmpleadoUserInterface.FORMULARIO_2,isVisible()));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.BOTON_MOSTRAR_CALENDARIO));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.DIV_MOSTRAR_AÑO));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.UL_SELECCIONAR_AÑO.getCssOrXPathSelector()
                .replace("$añoCalendario",datosRegistroEmpleadoOrangeHrm.getAñoNacimiento())));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.DIV_MOSTRAR_MES));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.UL_SELECCIONAR_MES.getCssOrXPathSelector()
                .replace("$mesCalendario",datosRegistroEmpleadoOrangeHrm.getMesNacimiento())));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.DIV_SELECCIONAR_DIA.getCssOrXPathSelector()
                .replace("$diaCalendario",datosRegistroEmpleadoOrangeHrm.getDiaNacimiento())));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.DIV_MOSTRAR_ESTADO_CIVIL));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.UL_SELECCIONAR_ESTADO_CIVIL.getCssOrXPathSelector()
                .replace("$estadoCivil",datosRegistroEmpleadoOrangeHrm.getEstadoCivil())));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.INPUT_GENERO.getCssOrXPathSelector()
                .replace("$genero",datosRegistroEmpleadoOrangeHrm.getGenero())));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.DIV_MOSTRAR_NACIONALIDAD));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.UL_SELECCIONAR_NACIONALIDAD.getCssOrXPathSelector()
                .replace("$nacionalidad",datosRegistroEmpleadoOrangeHrm.getNacionalidad())));

        switch (datosRegistroEmpleadoOrangeHrm.getFumador()) {
            case "Si":
                actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.LABEL_FUMADOR));
                break;
        }

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.DIV_MOSTRAR_GRUPO_SANGRE));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.UL_SELECCIONAR_GRUPO_SANGRE.getCssOrXPathSelector()
            .replace("$grupoSangre",datosRegistroEmpleadoOrangeHrm.getGrupoSangre())));

        actor.attemptsTo(Enter.theValue(datosRegistroEmpleadoOrangeHrm.getHobbies())
                .into(RegistroEmpleadoUserInterface.INPUT_HOBBIES));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.BOTON_NEXT_FORMULARIO_2));

        actor.attemptsTo(WaitUntil.the(RegistroEmpleadoUserInterface.FORMULARIO_3,isVisible()));

        actor.attemptsTo(Enter.theValue(datosRegistroEmpleadoOrangeHrm.getFechaEfectiva()).into(RegistroEmpleadoUserInterface.INUPUT_FECHA_EFECTIVA));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.DIV_MOSTRAR_REGION));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.UL_SELECCIONAR_REGION.getCssOrXPathSelector()
                .replace("$region",datosRegistroEmpleadoOrangeHrm.getRegion())));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.DIV_MOSTRAR_FTE));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.UL_SELECCIONAR_FTE.getCssOrXPathSelector()
                .replace("$fte",datosRegistroEmpleadoOrangeHrm.getFte())));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.DIV_MOSTRAR_DEPARTAMENTO_TEMPORAL));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.UL_SELECCIONAR_DEPARTAMENTO_TEMPORAL.getCssOrXPathSelector()
                .replace("$departamentoTemporal",datosRegistroEmpleadoOrangeHrm.getDepartamentoTemporal())));

        actor.attemptsTo(Click.on(RegistroEmpleadoUserInterface.BOTON_GUARDAR));

    }
}
