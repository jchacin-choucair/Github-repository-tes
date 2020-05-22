package pa.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class BuscarCursoUserInterface {

    public static final Target LNK_CATEGORIA = Target.the("enlace de categoria")
            .locatedBy("//strong[contains(text(),'$categoria')]");

    public static final Target INPUT_BUSCAR_CURSOS = Target.the("input donde se ingresa el nombre del curso a buscar")
            .located(By.xpath("//input[@type='text' and @id='coursesearchbox']"));

    public static final Target BOTON_BUSCAR_CURSO = Target.the("Boton para realizar la busqueda del curso").
            located(org.openqa.selenium.By.xpath("//button[@type='submit' and contains(text(),'Ir')]"));

    public static final Target LINK_CURSO = Target.the("link del curso encontrado")
            .locatedBy("//h4[contains(text(),'$curso')]");

    public static final Target NOMBRE_CURSO = Target.the("nombre del curso obtenido")
            .locatedBy("//h1[contains(text(),'$nombreCurso')]");
}
