package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ElementosWebTiposVentana {

    public static final Target VENTANAS = Target.the("WIDGETS").located(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards > div.card.mt-4.top-card:nth-child(3)"));
    public static final Target ALERTAS = Target.the("Fecha1").located(By.xpath("//span[contains(text(),'Alerts')]"));
    public static final Target ELEMENTOCLICK = Target.the("Fecha1").located(By.xpath("//button[@id='timerAlertButton']"));


}
