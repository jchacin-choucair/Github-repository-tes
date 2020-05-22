package pa.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ChoucairLoginUserInterface extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form tu login").located(By.xpath("//strong[contains(text(),'Ingresar')]"));
    public static final Target INPUT_USER = Target.the("input where do we write user").located(By.xpath("//input[@type='text' and @id='username']"));
    public static final Target INPUT_PASS = Target.the("input where do we write password").located(By.xpath("//input[@type='password' and @id='password']"));
    public static final Target BUTTON_LOGIN = Target.the("button the confirm login").located(By.xpath("//button[@type='submit' and contains(text(),'Acceder')]"));
}
