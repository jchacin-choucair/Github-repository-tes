package pa.com.choucair.certification.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;


public class IniciarSesion implements Task {
    Screen pantalla = new Screen();

    public static IniciarSesion conSikuli() {
        return Tasks.instrumented(IniciarSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String rutaProyecto = System.getProperty("user.dir");
        String rutaImagenes = "/src/test/resources/imagenes/";

        try {
            pantalla.click(rutaProyecto+rutaImagenes+"Ingresar.png");
            pantalla.wait(3.0);
        } catch (FindFailed findFailed) {
            
            findFailed.printStackTrace();
        }
    }
}
