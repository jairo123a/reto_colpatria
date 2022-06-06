package tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import userinterface.ElementosWebTiposVentana;


public class InteractuarLos implements Task {
    String[] losDato;
    public InteractuarLos(String[] losDato) {
        this.losDato=losDato;
    }

    public static InteractuarLos elementosCon(String[] losDato) {
        return new InteractuarLos(losDato);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(
              Click.on(ElementosWebTiposVentana.VENTANAS),
              Click.on(ElementosWebTiposVentana.ALERTAS),
              Click.on(ElementosWebTiposVentana.ELEMENTOCLICK)

      );
         WebDriver driver= Serenity.getWebdriverManager().getCurrentDriver();
        java.util.List<WebElement> botones=driver.findElements(By.xpath("//button[contains(text(),'Click me')]"));
        botones.get(0).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().alert().accept();
        botones.get(1).click();
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().alert().accept();

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
