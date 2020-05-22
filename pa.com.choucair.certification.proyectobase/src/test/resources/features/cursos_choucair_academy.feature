# language: es

  @Historia
  Característica: Buscar certificado en Academy Choucair
    Como usuario de Academy Choucair
    Quiero buscar un certificado
    Para poder regsitrarme.

  @IniciarSesionSikuli
  Esquema del escenario: Iniciar sesion con sikuli
    Dado que Jonathan ingresa a la pagina de Academy Choucair
    Cuando ingresa usuario y contraseña con Sikuli en el formulario de acceso
    Entonces verifica el inicio de la Sesion
    Ejemplos:
    |nombre  |
    |Jonathan|


  @BuscarCurso
  Esquema del escenario: Buscar certificado
    Dado que Jonathan ingresa a la pagina de Academy Choucair
    Y ingresa usuario y contraseña en el formulario de acceso
      |usuario  |password        |
      |jchacin  |Venezuela2020*.+|
    Cuando ingresa a la categoria de Cursos y Cetifificaciones
    Y busca el curso <curso>
    Entonces verifica que el curso encontrado corresponde a <curso>
    Ejemplos:
     |curso                |
     |Tutorial Nivel Básico|




