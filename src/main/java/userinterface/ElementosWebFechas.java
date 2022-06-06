package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebFechas {
    public static final Target WIDGETS = Target.the("WIDGETS").located(By.cssSelector("div.body-height:nth-child(2) div.home-content div.home-body div.category-cards > div.card.mt-4.top-card:nth-child(4)"));
    public static final Target DATEPICKER = Target.the("Fecha1").located(By.xpath("//span[contains(text(),'Date Picker')]"));
    public static final Target FECHA1CLICK = Target.the("Fecha1").located(By.id("datePickerMonthYearInput"));
    public static final Target FECHA1 = Target.the("Fecha1").located(By.xpath("//div[@class='react-datepicker__month']"));
    public static final Target FECHA2CLICK = Target.the("Fecha2").located(By.id("dateAndTimePickerInput"));
    public static final Target FECHA2 = Target.the("Fecha2").located(By.xpath("//div[@class='react-datepicker__month']"));
    public static final Target HORA = Target.the("Fecha2").located(By.xpath("//ul[@class='react-datepicker__time-list']"));



}
