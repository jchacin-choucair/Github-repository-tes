package choucair.automationDemoSite.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroDemoSiteUserInterface extends PageObject {

    public static final Target TEXT_NOMBRE = Target.the("caja de texto donde se ingresara el nombre")
            .located(By.xpath("//input[@type='text' and @placeholder='First Name']"));

    public static final Target TEXT_APELLIDO = Target.the("caja de texto donde se ingresara el apellido")
            .located(By.xpath("//input[@type='text' and @placeholder='Last Name']"));

    public static final Target AREA_DIRECCION = Target.the("area de texto donde se coloca la direccion")
            .located(By.xpath("//textarea[@ng-model='Adress']"));

    public static final Target TEXT_CORREO = Target.the("caja de texto para ingresar el correo")
            .located(By.xpath("//input[@type='email' and @ng-model='EmailAdress']"));

    public static final Target TEXT_TELEFONO = Target.the("caja de texto para ingresar el numero de telefono")
            .located(By.xpath("//input[@type='tel' and @ng-model='Phone']"));

    public static final Target RADIO_GENERO = Target.the("opcion del genero")
            .locatedBy("//input[@type='radio' and @name='radiooptions' and @value='$genero']");

    public static final Target CHECK_HOBBIES = Target.the("opciones de hobbies")
            .locatedBy("//input[@type='checkbox' and @value='$hobbies']");

    public static final Target DIV_MOSTRAR_LENGUAJE = Target.the("select para seleccionar el pasis")
            .located(By.xpath("//div[@id='msdd']"));

    public static final Target SELECCIONAR_LENGUAJE = Target.the("opcion para seleccionar el lenguaje")
            .locatedBy("//li[@list-select and @class='ng-scope']//child::a[contains(text(),'$lenguaje')]");

    public static final Target SELECT_HABILIDAD = Target.the("seleccionar la habilidad")
            .located(By.xpath("//select[@id='Skills' and @type='text']"));

    public static final Target SELECT_PAIS = Target.the("Seleccionar el pais")
            .located(By.xpath("//select[@id='countries' and @type='text']"));

    public static final Target MOSTRAR_SEGUNDO_PAIS = Target.the("mostrar las lista que despliega el segundo pais")
            .located(By.xpath("//span[@role='combobox']"));

    public static final Target SELECT_SEGUNDO_PAIS = Target.the("seleccionar el segundo pais")
            .locatedBy("//li[@role='treeitem' and contains(text(),'$segundo_pais')]");

    public static final Target SELECT_ANO_NACIMIENTO = Target.the("Seleccionamos el año de nacimiento")
            .located(By.xpath("//select[@id='yearbox']"));

    public static final Target SELECT_MES_NACIMIENTO = Target.the("select para seleccionar el mes de nacimiento")
            .located(By.xpath("//select[@type='text' and @ng-model='monthbox']"));

    public static final Target SELECT_DIA_NACIMIENTO = Target.the("select para seleccionar el dia de nacimiento")
            .located(By.xpath("//select[@id='daybox']"));

    public static final Target TEXT_CONTRASENA = Target.the("caja de texto para ingresar la contraseña")
            .located(By.xpath("//input[@id='firstpassword']"));

    public static final Target TEXT_CONFIRMAR_CONTRASENA = Target.the("caja de texto para confirmar la contraseña")
            .located(By.xpath("//input[@id='secondpassword']"));

    public static final Target FILE_IMAGEN = Target.the("compo donde se guarda la imgen a cargar")
            .located(By.xpath("//input[@id='imagesrc' and @type='file']"));

    public static final Target BOTON_REGISTRAR = Target.the("boton para guardar los datos del formulario")
            .located(By.xpath("//button[@id='submitbtn']"));

    public static final Target TEXT_POST_REGISTRO = Target.the("texto que se utilizara para verifcar el registro existoso")
            .located(By.xpath("//h4[contains(text(),' - Double Click on Edit Icon to ')]"));

}
