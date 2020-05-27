package choucair.automationDemoSite.tasks;

import choucair.automationDemoSite.userinterface.AbrirPaginaDemoSiteUserInterface;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirDemoSite implements Task {
    private AbrirPaginaDemoSiteUserInterface abrirPaginaDemoSiteUserInterface;

    public static AbrirDemoSite laPagina() {
        return Tasks.instrumented(AbrirDemoSite.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(abrirPaginaDemoSiteUserInterface));
    }
}
