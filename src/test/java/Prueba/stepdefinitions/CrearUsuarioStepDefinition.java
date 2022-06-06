package Prueba.stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DatosExcel;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Usuario;
import tasks.Abrir;
import tasks.Diligenciar;

import static util.Constantes.CERO;


public class CrearUsuarioStepDefinition {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());

    }
    @Given("^yo ingreso al sitio web demoqa$")
    public void yo_ingreso_al_sitio_web_demoqa() {
      OnStage.theActorCalled("jairo").wasAbleTo(Abrir.laPagina());
    }


    @When("^yo  ingreso a los  elementos web tables y agrego un nuevo registro$")
    public void yo_ingreso_a_los_elementos_web_tables_y_agrego_un_nuevo_registro(DataTable arg1) {
     String[] losDato = DatosExcel.llenarDatos(arg1,CERO);
     OnStage.theActorInTheSpotlight().attemptsTo(Diligenciar.unRegistroCon(losDato));
    }

    @Then("^yo verifico el registro exitoso$")
    public void yo_verifico_el_registro_exitoso() {OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Usuario.seRegistro()));
    }



}
