package pa.com.choucair.certification.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pa.com.choucair.certification.proyectobase.model.LoginData;
import pa.com.choucair.certification.proyectobase.userinterface.ChoucairLoginUserInterface;

public class Login implements Task {
    LoginData loginData = new LoginData();

    public Login (LoginData loginData){
        this.loginData = loginData;
    }

    public static Login onThePage(LoginData loginData) {
        return Tasks.instrumented(Login.class, loginData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginUserInterface.LOGIN_BUTTON));
        actor.attemptsTo(Enter.theValue(loginData.getUsuario()).into(ChoucairLoginUserInterface.INPUT_USER));
        actor.attemptsTo(Enter.theValue(loginData.getPassword()).into(ChoucairLoginUserInterface.INPUT_PASS));
        actor.attemptsTo(Click.on(ChoucairLoginUserInterface.BUTTON_LOGIN));
    }
}
