package Prueba.stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DatosExcel;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.InteractuarLos;

import static util.Constantes.*;

public class InteractuarElementos {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());

    }
    @When("^yo  ingreso a los  Alerts,Frame & Windows->Alerts y interactuar con las cuatro tipos de ventanas emergentes\\.$")
    public void yoIngresoALosAlertsFrameWindowsAlertsYInteractuarConLasCuatroTiposDeVentanasEmergentes(DataTable arg1) {
        String[] losDato = DatosExcel.llenarDatos(arg1,DOS);
        OnStage.theActorInTheSpotlight().attemptsTo(InteractuarLos.elementosCon(losDato));
    }

    @Then("^yo verifico el resultado esperado$")
    public void yoVerificoElResultadoEsperado() {

    }
}
