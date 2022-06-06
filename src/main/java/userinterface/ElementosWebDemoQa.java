package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebDemoQa {
    public static final Target ELEMENTOS = Target.the("elementos").located(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
    public static final Target WEBTABLES = Target.the("tables").located(By.xpath("//span[contains(text(),'Web Tables')]"));
    public static final Target ADD = Target.the("Button add").located(By.id("addNewRecordButton"));
    public static final Target FIRSTNAME = Target.the("Button add").located(By.id("firstName"));
    public static final Target LASTNAME = Target.the("Button add").located(By.id("lastName"));
    public static final Target EMAIL= Target.the("Button add").located(By.xpath("//*[@id=\"userEmail\"]"));
    public static final Target AGE = Target.the("Button add").located(By.id("age"));
    public static final Target SALARY = Target.the("Button add").located(By.id("salary"));
    public static final Target DEPARTAMENT = Target.the("Button add").located(By.id("department"));
    public static final Target ENVIAR = Target.the("Button add").located(By.id("submit"));
    public static final Target LISTADIASMESANTERIOR = Target.the("Button add").located(By.xpath("//div[@class='rt-tr-group']"));;
}
