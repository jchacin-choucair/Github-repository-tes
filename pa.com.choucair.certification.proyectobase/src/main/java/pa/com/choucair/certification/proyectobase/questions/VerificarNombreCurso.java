package pa.com.choucair.certification.proyectobase.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pa.com.choucair.certification.proyectobase.userinterface.BuscarCursoUserInterface;

public class VerificarNombreCurso implements Question<Boolean> {
    private String preguntaCurso;

    public VerificarNombreCurso(String preguntaCurso) {
        this.preguntaCurso = preguntaCurso;
    }

    public static VerificarNombreCurso toThe(String preguntaCurso) {
        return new VerificarNombreCurso(preguntaCurso);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = Text.of(BuscarCursoUserInterface.NOMBRE_CURSO.getCssOrXPathSelector()
                .replace("$nombreCurso",preguntaCurso)).viewedBy(actor).asString();
        if (preguntaCurso.equals(nameCourse)){
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }
}
