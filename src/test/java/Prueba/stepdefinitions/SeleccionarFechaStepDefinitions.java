package Prueba.stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.Before;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DatosExcel;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import tasks.Seleccionar;

import static util.Constantes.UNO;

public class SeleccionarFechaStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());

    }

    @When("^yo  ingreso a los  Widgets->Date Picker y seleccionar cualquier fecha en las opciones \\(Select Date y Date And Time\\)\\.$")
    public void yoIngresoALosWidgetsDatePickerYSeleccionarCualquierFechaEnLasOpcionesSelectDateYDateAndTime(DataTable arg1) {
        String[] losDato = DatosExcel.llenarDatos(arg1,UNO);
       OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.lasFechas(losDato));
    }

    @Then("^yo verifico la selecion exitosa$")
    public void yoVerificoLaSelecionExitosa() {

    }




}
