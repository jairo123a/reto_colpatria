package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ElementosWebDemoQa;
import util.Constantes;

import static util.Constantes.*;

public class Diligenciar implements Task {
    String[] losDatos;
    public Diligenciar(String[] losDatos){
       this.losDatos=losDatos;
   }

    public static Diligenciar unRegistroCon(String[] losDatos) {
    return new Diligenciar(losDatos);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ElementosWebDemoQa.ELEMENTOS),
                Click.on(ElementosWebDemoQa.WEBTABLES),
                Click.on(ElementosWebDemoQa.ADD),
                Enter.theValue(losDatos[Constantes.CERO]).into(ElementosWebDemoQa.FIRSTNAME),
                Enter.theValue(losDatos[Constantes.UNO]).into(ElementosWebDemoQa.LASTNAME),
                Click.on(ElementosWebDemoQa.EMAIL),
                Enter.theValue(losDatos[Constantes.DOS]).into(ElementosWebDemoQa.EMAIL),
                Enter.theValue(losDatos[TRES].replace(COMODIN,VALOR)).into(ElementosWebDemoQa.AGE),
                Enter.theValue(losDatos[CUATRO].replace(COMODIN,VALOR)).into(ElementosWebDemoQa.SALARY),
                Enter.theValue(losDatos[CINCO]).into(ElementosWebDemoQa.DEPARTAMENT),
                Click.on(ElementosWebDemoQa.ENVIAR)
        );
    }
}
