package choucair.orangehrm.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EmpleadoRegistradoUserInterface extends PageObject {

    public static final Target INPUT_ID_EMPLEADO_REGISTRADO = Target.the("Tomamos el id del empleado que registramos")
            .located(By.xpath("//input[@id='employeeId']"));

    public static final Target LINK_LISTA_EMPLEADOS = Target.the("muestra la lista de los empleados registrados")
            .located(By.xpath("//a[@id='menu_pim_viewEmployeeList' and @href='#/pim/employees']"));

    public static final Target INPUT_BUSCAR_EMPLEADO_REGISTRADO = Target.the("caja de texto donde se ingresa el empleado a buscar")
            .located(By.xpath("//input[@id='employee_name_quick_filter_employee_list_value']"));


}
