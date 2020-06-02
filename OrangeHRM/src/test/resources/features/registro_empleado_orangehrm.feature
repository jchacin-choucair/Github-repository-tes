# language: es
# autor: Jonathan Chacin

@HistoriaUsuario
Característica: realizar registro de empleado en Orange HRM
  Como usuario quiero realizar un registro de empleado en la sitio web de Orange HRM para crear un empleado.

  @RegistroEmpleadoOrange
  Esquema del escenario: Realizar registro de empleado en Orange HRM
    Dado que Jonathan necesita crear un empleado en el OrageHRM
    Cuando realiza la identificacion al sistema
    Y el ingresa al menu PIM para agregar un empleado
    Y el realiza el ingreso del registro en la aplicación
      |primerNombre     |segundoNombre    |apellido   |idEmpleado     |ubicacion  |añoNacimiento  |mesNacimiento  |diaNacimiento  |estadoCivil  |genero   |nacionalidad   |fumador  |grupoSangre  |hobbies  |fechaEfectiva  |region   |fte  |departamentoTemporal   |
      |<primerNombre>   |<segundoNombre>  |<apellido> |<idEmpleado>   |<ubicacion>|<añoNacimiento>|<mesNacimiento>|<diaNacimiento>|<estadoCivil>|<genero> |<nacionalidad> |<fumador>|<grupoSangre>|<hobbies>|<fechaEfectiva>|<region> |<fte>|<departamentoTemporal> |
    Y el busca al nuevo empleado registrado
    Entonces el visualiza el nuevo empleado en el aplicativo
    Ejemplos:
      |primerNombre     |segundoNombre    |apellido   |idEmpleado     |ubicacion                        |añoNacimiento  |mesNacimiento  |diaNacimiento|estadoCivil|genero|nacionalidad|fumador|grupoSangre|hobbies|fechaEfectiva   |region   |fte|departamentoTemporal|
      |Jonathan         |Smith            |Smith      |2020           |Canadian Development Cente       |1989           |July           |31           |Single     |Male  |Venezuelan  |Si     |AB         |Beisbol|Tue, 02 Jun 2020|Region-2 |1  |Sub unit-3          |
