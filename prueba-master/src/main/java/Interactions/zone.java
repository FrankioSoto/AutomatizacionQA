package Interactions;

import Models.zoneModel;
import jdk.internal.access.JavaIOFileDescriptorAccess;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;
import static Interfaces.zonePage.*;

  @AllArgsConstructor

public class zone implements Interaction {

    private final zoneModel variable4;
    public static zone zoneMethod (zoneModel variable4){

        return new zone(variable4);
    }

    @SneakyThrows
    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(admin1),Click.on(Supportt),Click.on(newSupportt),Click.on(newZone),Click.on(clickCampus),
                Enter.theValue(variable4.getCampus()).into(campus).thenHit(Keys.ENTER),Click.on(clickUnit),
                Enter.theValue(variable4.getUnit()).into(Unit).thenHit(Keys.ENTER),Click.on(deliveryCourier),
                Enter.theValue(variable4.getClickDeliveryCourier()).into(clickDeliveryCourier).thenHit(Keys.ENTER));

        Thread.sleep(5000);

        actor.attemptsTo(
                Click.on(save),Click.on(guide),
                Enter.theValue(variable4.getGuide()).into(guide).thenHit(Keys.ENTER),Click.on(refresh));

                Thread.sleep(5000);

        actor.attemptsTo(
                Open.url("https://pruebas.kairosplus.com.co/punteosoporte/action/setpunteo/idsoporte/"+ variable4.getNumerSupport()),
                Click.on(liquidate),Enter.theValue(variable4.getPlace()).into(place).thenHit(Keys.ENTER),
                Click.on(guideSupport),Enter.theValue(variable4.getGuideTwo()).into(guideTwo).thenHit(Keys.ENTER));


                Thread.sleep(5000);





      //  JavascriptExecutor jse =(JavascriptExecutor) driver;
       // jse.executeScript("documento.body.style.zoom= '50%'");

       //((IJavaScriptExecutor) Browser.Driver).ExecuteScript("document.body.style.zoom = '70%';");

        //await driver.executeScript('document.body.style.zoom = "300%"');











    }
}