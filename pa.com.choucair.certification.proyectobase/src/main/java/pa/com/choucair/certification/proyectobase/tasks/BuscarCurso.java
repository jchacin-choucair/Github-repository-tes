package pa.com.choucair.certification.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pa.com.choucair.certification.proyectobase.userinterface.BuscarCursoUserInterface;

public class BuscarCurso implements Task {
    private String curso;

    public BuscarCurso(String curso) {
        this.curso = curso;
    }

    public static BuscarCurso elCurso(String curso) {
        return Tasks.instrumented(BuscarCurso.class,curso);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(curso).into(BuscarCursoUserInterface.INPUT_BUSCAR_CURSOS));
        actor.attemptsTo(Click.on(BuscarCursoUserInterface.BOTON_BUSCAR_CURSO));
        actor.attemptsTo(Click.on(BuscarCursoUserInterface.LINK_CURSO.getCssOrXPathSelector().
                replace("$curso",curso)));
    }
}
