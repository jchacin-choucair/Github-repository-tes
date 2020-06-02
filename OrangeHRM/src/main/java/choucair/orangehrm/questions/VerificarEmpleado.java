package choucair.orangehrm.questions;

import choucair.orangehrm.userinterface.EmpleadoRegistradoUserInterface;
import choucair.orangehrm.userinterface.VerificaEmpleadoUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarEmpleado implements Question<Boolean> {
    private String verificaEmpleado;

    public VerificarEmpleado(String verificaEmpleado) {
        this.verificaEmpleado = verificaEmpleado;
    }

    public static VerificarEmpleado empleadoRegistrado(String verificaEmpleado) {
        return new VerificarEmpleado(verificaEmpleado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;

        verificaEmpleado = Text.of(VerificaEmpleadoUserInterface.SPAN_ID_EMPLEADO_BUSCADO).viewedBy(actor).asString();
        String idEmpleadoEncontrado = Text.of(VerificaEmpleadoUserInterface.TD_ID_EMPLEADO_ENCONTRADO).viewedBy(actor).asString();

        if(verificaEmpleado.equals(idEmpleadoEncontrado)){
            resultado =true;
        }
        else{
            resultado = false;
        }
        return resultado;
    }
}

