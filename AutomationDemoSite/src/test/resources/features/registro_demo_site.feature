# language: es

@HistoriaUsuario
Característica: realizar registro en Automation Demo Site
  Como usuario quiero realizar un registro en Automation Demo Site para crear un usuario

  @RegistroDemoSite
  Esquema del escenario: Realizar registro en la pagina Automation Demo Site
    Dado que Jonathan quiere acceder a la Web Automation Demo Site
    Cuando el realiza el registro en la página
      |nombre       |apellido      |direccion     |archivo  |correo         |telefono   |genero     |hobbies    |lenguaje   |habilidades      |pais   |pais2  |anoNacimiento  |mesNacimiento  |diaNacimiento  |contrasena   |confirmarContrasena  |
      |<nombre>     |<apellido>    |<direccion>   |<archivo>|<correo>       |<telefono> |<genero>   |<hobbies>  |<lenguaje> |<habilidades>    |<pais> |<pais2>|<anoNacimiento>|<mesNacimiento>|<diaNacimiento>|<contrasena> |<confirmarContrasena>|
    Entonces el verifica que se carga la pantalla con texto <textVerificar>
    Ejemplos:
      |nombre   |apellido|direccion|archivo                                           |correo       |telefono   |genero|hobbies|lenguaje|habilidades|pais   |pais2                   |anoNacimiento|mesNacimiento|diaNacimiento|contrasena|confirmarContrasena|textVerificar                                     |
      |Peter    |Smith   |Panama   |C:\Users\Jonathan\Pictures\Saved Pictures\Test.jpg|Aaa@gmail.com|0192837465 |FeMale|Movies |Spanish |Android    |Panama |United States of America|1989         |July         |31           |Aa12345-  |Aa12345-           |- Double Click on Edit Icon to EDIT the Table Row.|