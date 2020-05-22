package pa.com.choucair.certification.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import pa.com.choucair.certification.proyectobase.userinterface.ChoucairAcademyUserInterface;


public class OpenUp implements Task {
    private ChoucairAcademyUserInterface choucairAcademyUserInterface;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(choucairAcademyUserInterface));
    }
}
