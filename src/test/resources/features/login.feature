# language: es
@Logueo @SmokeTest @test
Característica: Ingreso al sistema
  Como un usuario  demo
  Quiero ingresar a la aplicación
  Para utilizar sus funcionalidades


  Escenario: Realizar ingreso exitoso a la aplicación
    Dado usuario desea ingresar a la aplicacion como usuario
    Y selecciono la opcion de Log In
    E ingreso con la siguiente informacion
      | username        | password |
      | bob@example.com | 10203040 |

