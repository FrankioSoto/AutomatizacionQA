package Interactions;

import Models.remissionHeadquartersModel;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import static Interfaces.remissionHeadquartersPage.*;
//import static Interfaces.supportPage.inputGuide;
import static org.openqa.selenium.Keys.ENTER;

@AllArgsConstructor
public class remissionHeadquartersInteraction implements Interaction {
    private final remissionHeadquartersModel variable;
    private final Actor actor = Actor.named("actor");

    public static remissionHeadquartersInteraction headquartersMethod(remissionHeadquartersModel variable) {

        return new remissionHeadquartersInteraction(variable);
    }

    @SneakyThrows
    @Override

    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(administrationButton1),
                Click.on(supports1),
                Click.on(newManifest1),
                Click.on(remissionHeadquarters),
                SelectFromOptions.byValue("2").from(originBusinessUnit),
                SelectFromOptions.byValue("1").from(destinyBusinessUnit),
                Click.on(submitbutton));

        String manifest = manifestNumberHead.resolveFor(actor).getText();
        String format = manifest.replaceAll("[(][^)]*[)]", "");
        actor.attemptsTo(
                Open.url("https://pruebas.kairosplus.com.co/punteosoporte/action/setpunteoasignadosededestino/idsoporte/" + format));



        Thread.sleep(3000);
        actor.attemptsTo(
                Enter.theValue(variable.getGuideNumberRemission()).into(inputGuideRemission).thenHit(ENTER)

        );

    }
}









