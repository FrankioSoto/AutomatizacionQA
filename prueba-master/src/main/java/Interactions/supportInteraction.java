package Interactions;

import Models.guideModel;
import Models.orderModel;
import Models.supportModel;
import com.ibm.icu.text.UFormat;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static Interfaces.guidePage.*;
import static Interfaces.supportPage.*;
import static Interfaces.supportPage.refresh;

@AllArgsConstructor
public class supportInteraction implements Interaction {
    private final supportModel variable2;
    private final orderModel variable3;
public static supportInteraction supportMethod (supportModel variable2, orderModel variable3){
    return new supportInteraction(variable2, variable3);
}

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(
        Click.on(admin),
        Click.on(support),
        Click.on(newSupport),
        Click.on(materialSupport),
        Enter.theValue(variable2.getInputSupport()).into(inputSupport),
        Enter.theValue(variable3.getOrderInputV()).into(searchOrder),
        SelectFromOptions.byValue("25247").from(selectClient),
        SelectFromOptions.byValue("3").from(selectStore),
        Click.on(save));

String manifest = manifestNumber.resolveFor(actor).getText();
String format = manifest.replaceAll("[(][^)]*[)]", "");

actor.attemptsTo(
        Open.url("https://pruebas.kairosplus.com.co/punteovstarjetas/action/setpunteo/idsoporte/"+ format));
Thread.sleep(5000);

actor.attemptsTo(
        Enter.theValue(variable2.getCardId()).into(cardId).thenHit(Keys.ENTER));
Thread.sleep(10000);

    }
}
