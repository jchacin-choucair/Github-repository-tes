package choucair.automationDemoSite.tasks;

import choucair.automationDemoSite.model.DatosRegistroDemoSite;
import choucair.automationDemoSite.userinterface.RegistroDemoSiteUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Upload;


import java.nio.file.Paths;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RealizarRegistro implements Task {
    private DatosRegistroDemoSite datosRegistroDemoSite;

    public RealizarRegistro(DatosRegistroDemoSite datosRegistroDemoSite) {
        this.datosRegistroDemoSite = datosRegistroDemoSite;
    }

    public static RealizarRegistro enDemoSite(DatosRegistroDemoSite datosRegistroDemoSite) {
        return Tasks.instrumented(RealizarRegistro.class, datosRegistroDemoSite);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datosRegistroDemoSite.getNombre())
                .into(RegistroDemoSiteUserInterface.TEXT_NOMBRE));

        actor.attemptsTo(Enter.theValue(datosRegistroDemoSite.getApellido())
                .into(RegistroDemoSiteUserInterface.TEXT_APELLIDO));

        actor.attemptsTo(Enter.theValue(datosRegistroDemoSite.getDireccion())
                .into(RegistroDemoSiteUserInterface.AREA_DIRECCION));

        actor.attemptsTo(Upload.theFile(Paths.get(datosRegistroDemoSite.getArchivo()))
                .to(RegistroDemoSiteUserInterface.FILE_IMAGEN));

        actor.attemptsTo(Enter.theValue(datosRegistroDemoSite.getCorreo())
                .into(RegistroDemoSiteUserInterface.TEXT_CORREO));

        actor.attemptsTo(Enter.theValue(datosRegistroDemoSite.getTelefono())
                .into(RegistroDemoSiteUserInterface.TEXT_TELEFONO));

        actor.attemptsTo(Click.on(RegistroDemoSiteUserInterface.RADIO_GENERO.getCssOrXPathSelector()
                .replace("$genero",datosRegistroDemoSite.getGenero())));

        actor.attemptsTo(Click.on(RegistroDemoSiteUserInterface.CHECK_HOBBIES.getCssOrXPathSelector()
                .replace("$hobbies",datosRegistroDemoSite.getHobbies())));

        actor.attemptsTo(Click.on(RegistroDemoSiteUserInterface.DIV_MOSTRAR_LENGUAJE));

        actor.attemptsTo(Click.on(RegistroDemoSiteUserInterface.SELECCIONAR_LENGUAJE.getCssOrXPathSelector()
                .replace("$lenguaje",datosRegistroDemoSite.getLenguaje())));

        actor.attemptsTo(SelectFromOptions.byVisibleText(datosRegistroDemoSite.getHabilidades())
                .from(RegistroDemoSiteUserInterface.SELECT_HABILIDAD));

        actor.attemptsTo(SelectFromOptions.byVisibleText(datosRegistroDemoSite.getPais())
                .from(RegistroDemoSiteUserInterface.SELECT_PAIS));

        actor.attemptsTo(Click.on(RegistroDemoSiteUserInterface.MOSTRAR_SEGUNDO_PAIS));

        actor.attemptsTo(Click.on(RegistroDemoSiteUserInterface.SELECT_SEGUNDO_PAIS.getCssOrXPathSelector()
                .replace("$segundo_pais",datosRegistroDemoSite.getPais2())));

        actor.attemptsTo(SelectFromOptions.byVisibleText(datosRegistroDemoSite.getAnoNacimiento())
                .from(RegistroDemoSiteUserInterface.SELECT_ANO_NACIMIENTO));

        actor.attemptsTo(SelectFromOptions.byVisibleText(datosRegistroDemoSite.getMesNacimiento())
                .from(RegistroDemoSiteUserInterface.SELECT_MES_NACIMIENTO));

        actor.attemptsTo(SelectFromOptions.byVisibleText(datosRegistroDemoSite.getDiaNacimiento())
                .from(RegistroDemoSiteUserInterface.SELECT_DIA_NACIMIENTO));

        actor.attemptsTo(Enter.theValue(datosRegistroDemoSite.getContrasena())
                .into(RegistroDemoSiteUserInterface.TEXT_CONTRASENA));

        actor.attemptsTo(Enter.theValue(datosRegistroDemoSite.getConfirmarContrasena())
                .into(RegistroDemoSiteUserInterface.TEXT_CONFIRMAR_CONTRASENA));

        actor.attemptsTo(Click.on(RegistroDemoSiteUserInterface.BOTON_REGISTRAR));

        /*actor.attemptsTo(WaitUntil.the(RegistroDemoSiteUserInterface.TEXT_VERIFICAR,isVisible())
                .forNoMoreThan(10).seconds());*/



    }
}
