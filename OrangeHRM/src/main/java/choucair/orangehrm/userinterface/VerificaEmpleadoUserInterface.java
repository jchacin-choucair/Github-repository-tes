package choucair.orangehrm.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VerificaEmpleadoUserInterface extends PageObject {

    public static final Target TD_ID_EMPLEADO_ENCONTRADO = Target.the("columna donde se muestra el id del empleado encontrado")
            .located(By.xpath("//table[@id='employeeListTable']//child::tbody//child::tr//child::td[2]"));

    public static final Target SPAN_ID_EMPLEADO_BUSCADO = Target.the("span donde se muestra el id del empleado buscado")
            .located(By.xpath("//table[@id='employeeListTable']//child::tbody//child::tr//child::td[2]"));
}
