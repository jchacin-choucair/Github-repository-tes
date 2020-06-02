package choucair.orangehrm.tasks;

import choucair.orangehrm.userinterface.AbrirPaginaOrangeHrmUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirOrangeHrm implements Task {

    private AbrirPaginaOrangeHrmUserInterface abrirPaginaOrangeHrmUserInterface;

    public static AbrirOrangeHrm laPagina() {
        return Tasks.instrumented(AbrirOrangeHrm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(abrirPaginaOrangeHrmUserInterface));
    }
}
