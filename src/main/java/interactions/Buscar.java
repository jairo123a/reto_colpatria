package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import userinterface.ElementosWebDemoQa;
import userinterface.ElementosWebFechas;

import java.util.List;

public class Buscar implements Interaction {
    Target listaMenu;
    String opcionMenu;
    String opcion1;
    public Buscar(Target listaMenu, String opcionMenu, String opcion1){
        this.listaMenu=listaMenu;
        this.opcionMenu=opcionMenu;
       this.opcion1=opcion1;
    }

    public static Buscar elPost(Target listaMenu, String opcionMenu, String opcion1) {
        return Tasks.instrumented(Buscar.class,listaMenu,opcionMenu,opcion1);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
      if(opcion1=="1") {
          List<WebElement> elementList = listaMenu.resolveFor(actor).findElements(By.xpath("//div//div"));
          for (int i = 0; i < elementList.size(); i++) {
              if (elementList.get(i).getText().equals(opcionMenu)) {
                  elementList.get(i).click();
                  break;
              }
          }
      }else {
          List<WebElement> elementList = listaMenu.resolveFor(actor).findElements(By.xpath("//li"));
          for (int i = 0; i < elementList.size(); i++) {
              if (elementList.get(i).getText().equals(opcionMenu)) {
                  elementList.get(i).click();
                  break;
              }
          }
      }

    }
}
