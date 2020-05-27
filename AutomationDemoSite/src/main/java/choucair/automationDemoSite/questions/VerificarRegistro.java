package choucair.automationDemoSite.questions;

import choucair.automationDemoSite.userinterface.RegistroDemoSiteUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarRegistro implements Question<Boolean> {
    private String textoVerificar;

    public VerificarRegistro(String textoVerificar) {
        this.textoVerificar = textoVerificar;
    }

    public static VerificarRegistro deFormulario(String textoVerificar) {
        return new VerificarRegistro(textoVerificar);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String textoPostRegistro = Text.of(RegistroDemoSiteUserInterface.TEXT_POST_REGISTRO).viewedBy(actor).asString();

        if(textoVerificar.equals(textoPostRegistro)){
            resultado =true;
        }
        else{
            resultado = false;
        }
        return resultado;
    }
}
