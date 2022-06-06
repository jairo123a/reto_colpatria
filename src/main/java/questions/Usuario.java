package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import userinterface.ElementosWebDemoQa;

import java.util.List;

import static util.Constantes.RESPUESTA;

public class Usuario implements Question<Boolean> {


    public static Usuario seRegistro() {
        return new Usuario();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        List<WebElement> elementList = ElementosWebDemoQa.LISTADIASMESANTERIOR.resolveFor(actor).findElements(By.xpath("//div[@role='gridcell']"));
        boolean respuesta=false;
        for (int i = 0; i < elementList.size(); i++) {
            if (elementList.get(i).getText().equals(RESPUESTA)) {
                elementList.get(i).click();
                respuesta=true;
                break;

            }

        }
    return respuesta;
    }
    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}
