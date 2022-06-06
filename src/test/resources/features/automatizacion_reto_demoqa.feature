Feature: Ingresar al sitio web demoqa y realizar el reto tecnico
  @regresion

  @caso1

  Scenario: Ingresar al sitio web y ingresar un elemento  web tables y eliminarlo
    Given yo ingreso al sitio web demoqa
    When  yo  ingreso a los  elementos web tables y agrego un nuevo registro
    |data|
    |data|
    Then  yo verifico el registro exitoso


  @caso2
  Scenario: debe ingresar a la opción Widgets->Date Picker y seleccionar cualquier fecha en las opciones (Select Date y Date And Time).
    Given yo ingreso al sitio web demoqa
    When  yo  ingreso a los  Widgets->Date Picker y seleccionar cualquier fecha en las opciones (Select Date y Date And Time).
      |data|
      |data|
    Then  yo verifico la selecion exitosa

  @caso3
  Scenario: debe ingresar a la opción Alerts,Frame & Windows->Alerts   y interactuar con las 4 tipos de ventanas emergentes tanto parar activarlas como para cerrarlas..
    Given yo ingreso al sitio web demoqa
    When  yo  ingreso a los  Alerts,Frame & Windows->Alerts y interactuar con las cuatro tipos de ventanas emergentes.
      |data|
      |data|
    Then  yo verifico el resultado esperado
