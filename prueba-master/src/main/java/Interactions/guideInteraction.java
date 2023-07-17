package Interactions;

import Models.guideModel;
import Models.loginModel;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Switch;

import static Interfaces.guidePage.*;
import static Interfaces.loginPage.*;

@AllArgsConstructor
public class guideInteraction implements Interaction {
    private final guideModel variable2;
public static guideInteraction guideMethod (guideModel variable2){
    return new guideInteraction(variable2);
}

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(
        Click.on(mailClient),
        Click.on(search),
        Click.on(searchGuide),
        Enter.theValue(variable2.getGuide()).into(enterGuide),
        Click.on(buttonSearchGuide));
Thread.sleep(5000);

actor.attemptsTo(
        //Click.on(numberGuide));
        //Switch.toNewWindow();
        Open.url("https://pruebas.kairosplus.com.co/guias/action/detalletotalguia/idguia/"+ variable2.getGuide()));
Thread.sleep(5000);
actor.attemptsTo(
        prubInteraction.guideMethod());

    }
}
