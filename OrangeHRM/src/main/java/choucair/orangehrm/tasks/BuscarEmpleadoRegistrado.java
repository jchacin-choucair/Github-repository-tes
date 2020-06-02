package choucair.orangehrm.tasks;

import choucair.orangehrm.userinterface.EmpleadoRegistradoUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.questions.Value;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarEmpleadoRegistrado implements Task {
    private String idEmpleadoRegistrado;

    public BuscarEmpleadoRegistrado(String idEmpleadoRegistrado) {
        this.idEmpleadoRegistrado = idEmpleadoRegistrado;
    }

    public static BuscarEmpleadoRegistrado nuevoEmpleado(String idEmpleadoRegistrado) {
        return Tasks.instrumented(BuscarEmpleadoRegistrado.class,idEmpleadoRegistrado);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(EmpleadoRegistradoUserInterface.INPUT_ID_EMPLEADO_REGISTRADO,isClickable()));

        actor.attemptsTo(Click.on(EmpleadoRegistradoUserInterface.INPUT_ID_EMPLEADO_REGISTRADO));

        idEmpleadoRegistrado = Value.of(EmpleadoRegistradoUserInterface.INPUT_ID_EMPLEADO_REGISTRADO).viewedBy(actor).asString();

        actor.attemptsTo(Click.on(EmpleadoRegistradoUserInterface.LINK_LISTA_EMPLEADOS));

        actor.attemptsTo(Enter.theValue(idEmpleadoRegistrado).into(EmpleadoRegistradoUserInterface.INPUT_BUSCAR_EMPLEADO_REGISTRADO));

        actor.attemptsTo(Hit.the(Keys.ENTER).into(EmpleadoRegistradoUserInterface.INPUT_BUSCAR_EMPLEADO_REGISTRADO));

    }
}
