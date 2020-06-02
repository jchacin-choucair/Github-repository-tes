package choucair.orangehrm.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroEmpleadoUserInterface extends PageObject {


    //form[@id='pimAddEmployeeForm']

    public static final Target FORMULARIO_EMPLEADO = Target.the("primer fomulario del registro")
            .located(By.xpath("//form[@id='pimAddEmployeeForm']"));

    public static final Target LABEL_PRIMER_NOMBRE = Target.the("caja de texto para introducir el primer nombre")
            .located(By.xpath("//label[contains(text(),'First Name')]"));

    public static final Target INPUT_PRIMER_NOMBRE = Target.the("caja de texto para introducir el primer nombre")
            .located(By.xpath("//input[@id='firstName']"));

    public static final Target INPUT_SEGUNDO_NOMBRE = Target.the("caja de texto para introducir el segundo nombre")
            .located(By.xpath("//input[@id='middleName']"));

    public static final Target INPUT_APELLIDO = Target.the("caja de texto para introducir el apellido")
            .located(By.xpath("//input[@id='lastName']"));

    public static final Target INPUT_ID_EMPLEADO = Target.the("caja de texto para introducir la identificacion")
            .located(By.xpath("//input[@id='employeeId']"));

    public static final Target INPUT_MUESTRA_UBICACION = Target.the("input que muestra la lista de ubicaciones")
            .located(By.xpath("//div[@class='select-wrapper initialized']"));

    public static final Target SPAN_SELECCIONA_UBICACION = Target.the("input que muestra la lista de ubicaciones")
            .locatedBy("//span[contains(text(),'$ubicacion')]");

    public static final Target BOTON_NEXT = Target.the("Boton para pasar al proximo formulario")
            .located(By.xpath("//a[@id='systemUserSaveBtn']"));

    public static final Target FORMULARIO_2 = Target.the("segundo formulario del registro")
            .located(By.xpath("//form[@id='pimPersonalDetailsForm']"));

    public static final Target BOTON_MOSTRAR_CALENDARIO = Target.the("Boton para mostrar el calendario de fecha de nacimiento")
            .located(By.xpath("//i[@class='material-icons action-icon date-picker-open-icon']"));

    public static final Target DIV_MOSTRAR_AÑO = Target.the("muestra el año del calendario")
            .located(By.xpath("//div[@class='select-wrapper picker__select--year']"));

    public static final Target UL_SELECCIONAR_AÑO = Target.the("seleccionar el año del calendario")
            .locatedBy("//ul[contains(@id,'select-options') ]//child::li//child::span[contains(text(),'$añoCalendario')]");

    public static final Target DIV_MOSTRAR_MES= Target.the("mostrar mes del calendario")
            .located(By.xpath("//div[@class='select-wrapper picker__select--month']"));

    public static final Target UL_SELECCIONAR_MES = Target.the("seleccionar el mes del calendario")
            .locatedBy("//ul[contains(@id,'select-options') ]//child::li//child::span[contains(text(),'$mesCalendario')]");

    public static final Target DIV_SELECCIONAR_DIA = Target.the("seleccionar el dia calendario")
            .locatedBy("//div[@class='picker__calendar-container']//child::tbody//child::tr//child::td//child::div[contains(text(),'$diaCalendario')]");

    public static final Target DIV_MOSTRAR_ESTADO_CIVIL = Target.the("div que muestra el estado civil")
            .locatedBy("//div[@id='emp_marital_status_inputfileddiv']");

    public static final Target UL_SELECCIONAR_ESTADO_CIVIL = Target.the("ul para seleccionar el estado civil")
            .locatedBy("//ul[contains(@id,'select-options')]//child::li//child::span[contains(text(),'$estadoCivil')]");

    public static final Target INPUT_GENERO = Target.the("Input para seleccionar el genero")
            .locatedBy("//label[contains(@for,'emp_gender') and contains(text(),'$genero')]");


    public static final Target DIV_MOSTRAR_NACIONALIDAD = Target.the("div para mostrar la nacionalidad")
            .located(By.xpath("//div[@id='nation_code_inputfileddiv']"));

    public static final Target UL_SELECCIONAR_NACIONALIDAD = Target.the("ul para seleccionar la nacionalidad")
            .locatedBy("//ul[contains(@id,'select-options')]//child::li//child::span[contains(text(),'$nacionalidad')]");

    public static final Target LABEL_FUMADOR = Target.the("seleccionar empleado fumador")
            .locatedBy("//label[@for='smoker' and contains(text(),'Smoker')]");

    public static final Target DIV_MOSTRAR_GRUPO_SANGRE = Target.the("div para mostrar el gripo de sandre")
            .located(By.xpath("//div[@id='1_inputfileddiv']"));

    public static final Target UL_SELECCIONAR_GRUPO_SANGRE = Target.the("seleccionar grupo de sangre")
            .locatedBy("//ul[contains(@id,'select-options')]//child::li//child::span[contains(text(),'$grupoSangre')]");

    public static final Target INPUT_HOBBIES = Target.the("caja de texto para ingresar los hobbies")
            .located(By.xpath("//input[@id='5' and @type='text']"));

    public static final Target BOTON_NEXT_FORMULARIO_2 = Target.the("boton para pasar el siguiente formulario")
            .located(By.xpath("//button[@type='button' and contains(text(),'Next')]"));

    public static final Target FORMULARIO_3 = Target.the("Tercer formulario del registro")
            .located(By.xpath("//form[@name='job.employmentDetailsForm']"));

    public static final Target INUPUT_FECHA_EFECTIVA = Target.the("input para ingresar la fecha efectiva")
            .located(By.xpath("//input[@id='add_employee_effective_date']"));

    public static final Target DIV_MOSTRAR_REGION = Target.the("Div que muestra la region")
            .located(By.xpath("//div[@id='9_inputfileddiv']"));

    public static final Target UL_SELECCIONAR_REGION = Target.the("seleccionar la region")
            .locatedBy("//ul[contains(@id,'select-options')]//child::li//child::span[contains(text(),'$region')]");

    public static final Target DIV_MOSTRAR_FTE = Target.the("div que muesra lista de fte")
            .located(By.xpath("//div[@id='10_inputfileddiv']"));

    public static final Target UL_SELECCIONAR_FTE = Target.the("ul para seelccionar el fte")
            .locatedBy("//div[@id='10_inputfileddiv']//child::ul[contains(@id,'select-options')]//child::li//child::span[contains(text(),'$fte')]");

    public static final Target DIV_MOSTRAR_DEPARTAMENTO_TEMPORAL = Target.the("div que muesra lista departamento temporal")
            .located(By.xpath("//div[@id='11_inputfileddiv']"));

    public static final Target UL_SELECCIONAR_DEPARTAMENTO_TEMPORAL = Target.the("ul para seleccionar departamento temporal")
            .locatedBy("//ul[contains(@id,'select-options')]//child::li//child::span[contains(text(),'$departamentoTemporal')]");

    public static final Target BOTON_GUARDAR = Target.the("Boton para guardar el registro del empleado")
            .located(By.xpath("//button[@type='button' and contains(text(),'Save')]"));

}
