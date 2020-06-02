package choucair.orangehrm.tasks;

import choucair.orangehrm.userinterface.IngresarMenuUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarAlMenu implements Task {

    public static IngresarAlMenu elPIMAgregarEmpleado() {
        return Tasks.instrumented(IngresarAlMenu.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(IngresarMenuUserInterface.LINK_MENU_PIM));
        actor.attemptsTo(Click.on(IngresarMenuUserInterface.LINK_AGREGAR_EMPLEADO));

    }
}
