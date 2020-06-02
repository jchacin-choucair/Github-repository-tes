package choucair.orangehrm.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarMenuUserInterface extends PageObject {

    public static final Target LINK_MENU_PIM = Target.the("link que abre el menu PIM")
            .located(By.xpath("//li[@id='menu_pim_viewPimModule']//child::a[@class='collapsible-header waves-effect waves-orange']"));

    public static final Target LINK_AGREGAR_EMPLEADO = Target.the("link para ingresar al formulario de registro de empleados")
            .located(By.xpath("//a[@id='menu_pim_addEmployee' and @href='#/pim/addEmployee']"));
}
