package Interactions;

import Models.couriersupportModel;
import Models.supportModel;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static Interfaces.couriersupportPage.*;


@AllArgsConstructor
public class couriersupportInteraction implements Interaction {
    private final couriersupportModel alliedCourier;
public static couriersupportInteraction courierMethod (couriersupportModel alliedCourier){
    return new couriersupportInteraction(alliedCourier);
}

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(administration),
        Click.on(support),
        Click.on(optionNewSupport),
        Click.on(supportCourierAllied),
        Enter.theValue(alliedCourier.getCourierSupport()).into(courierSupport),
        SelectFromOptions.byValue("83").from(selectCourier),
        Click.on(saveButton),
        Open.url("https://pruebas.kairosplus.com.co/punteoasignacion24horas/action/setpunteoasignarcourrieraliado/idsoporte/"+alliedCourier.getSupport()));

    Thread.sleep(2000);
        actor.attemptsTo(
                Enter.theValue(alliedCourier.getGuide()).into(guide).thenHit(Keys.ENTER));

        Thread.sleep(2000);
        }

}