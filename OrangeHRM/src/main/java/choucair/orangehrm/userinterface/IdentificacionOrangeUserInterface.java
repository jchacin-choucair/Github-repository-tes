package choucair.orangehrm.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IdentificacionOrangeUserInterface extends PageObject {

    public static final Target BOTON_LOGIN = Target.the("Botan para realizar la identificacion a OrangeHrm")
            .located(By.xpath("//input[@id='btnLogin']"));
}
