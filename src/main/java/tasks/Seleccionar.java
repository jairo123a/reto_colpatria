package tasks;

import interactions.Buscar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import userinterface.ElementosWebFechas;
import util.Constantes;

import static util.Constantes.*;

public class Seleccionar implements Task {
    String[] losDatos;
    public Seleccionar(String[] losDatos){
        this.losDatos=losDatos;
    }
    public static Seleccionar lasFechas(String[] losDatos) {
        return new Seleccionar(losDatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ElementosWebFechas.WIDGETS),
                Click.on(ElementosWebFechas.DATEPICKER),
                Click.on(ElementosWebFechas.FECHA1CLICK),
                Buscar.elPost(ElementosWebFechas.FECHA1,losDatos[CERO].replace(COMODIN,VALOR),"1"),
                Click.on(ElementosWebFechas.FECHA2CLICK),
                Buscar.elPost(ElementosWebFechas.FECHA2,losDatos[UNO].replace(COMODIN,VALOR),"1"),
                Buscar.elPost(ElementosWebFechas.HORA,losDatos[DOS].replace(COMODIN,VALOR),"2"),
                Click.on(ElementosWebFechas.FECHA2CLICK),
                Click.on(ElementosWebFechas.FECHA2CLICK)


        );
    }
}
