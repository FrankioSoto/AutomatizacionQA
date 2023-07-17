package Interactions;

import Models.supportRemissionModel;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static Interfaces.supportRemissionPage.*;

@AllArgsConstructor
public class supportRemissionInteraction implements Interaction {
    private final supportRemissionModel variable2;


    public static supportRemissionInteraction supportMethod (supportRemissionModel variable2){
    return new supportRemissionInteraction(variable2);
}

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(
        Click.on(admin),
        Click.on(support),
        Click.on(newSupport),
        Click.on(materialSupport),
        Click.on(branch),
        Enter.theValue(variable2.getBranchName()).into(branchName).thenHit(Keys.ENTER),
        Click.on(save),
        Click.on(destinationBranch),
        Switch.toNewWindow(),
        //Open.url("https://pruebas.kairosplus.com.co/punteosoporte/action/setpunteosededestino/idsoporte/"+ variable2.getGuide()),
        Enter.theValue(variable2.getInputGuide()).into(inputGuide).thenHit(Keys.ENTER));
Thread.sleep(10000);

actor.attemptsTo(
        Switch.toWindowTitled("APLICATIVO_POLARIX"));
Thread.sleep(5000);

actor.attemptsTo(
        Click.on(refresh),
        Click.on(managerDelivery),
        Switch.toNewWindow(),
        Enter.theValue(variable2.getInputGuide2()).into(inputGuide2).thenHit(Keys.ENTER));
Thread.sleep(10000);

actor.attemptsTo(
        Switch.toWindowTitled("APLICATIVO_POLARIX"));
Thread.sleep(5000);

actor.attemptsTo(
        Click.on(refresh));

Thread.sleep(25000);

    }
}
