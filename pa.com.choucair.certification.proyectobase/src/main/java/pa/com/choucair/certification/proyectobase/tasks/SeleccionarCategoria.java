package pa.com.choucair.certification.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import pa.com.choucair.certification.proyectobase.userinterface.BuscarCursoUserInterface;

public class SeleccionarCategoria implements Task {

    private String categoria;

    public SeleccionarCategoria(String categoria) {
        this.categoria = categoria;
    }

    public static SeleccionarCategoria deEstudio(String categoria) {
        return Tasks.instrumented(SeleccionarCategoria.class,categoria);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String[] categoriaSplit = categoria.split(" ");
        actor.attemptsTo(Click.on(BuscarCursoUserInterface.LNK_CATEGORIA.getCssOrXPathSelector()
                .replace("$categoria",categoriaSplit[0])));
    }
}
