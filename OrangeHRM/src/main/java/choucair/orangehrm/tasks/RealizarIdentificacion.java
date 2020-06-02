package choucair.orangehrm.tasks;

import choucair.orangehrm.userinterface.IdentificacionOrangeUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class RealizarIdentificacion implements Task {

    public static RealizarIdentificacion enOrange() {
        return Tasks.instrumented(RealizarIdentificacion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(IdentificacionOrangeUserInterface.BOTON_LOGIN));
    }
}
