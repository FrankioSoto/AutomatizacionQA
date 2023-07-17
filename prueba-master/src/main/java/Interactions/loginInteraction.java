package Interactions;

import Models.loginModel;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static Interfaces.loginPage.*;

@AllArgsConstructor
public class loginInteraction implements Interaction {
    private final loginModel variable;
public static loginInteraction loginMethod (loginModel variable){
    return new loginInteraction(variable);
}

    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(
        Enter.theValue(variable.getUser()).into(user),
        Enter.theValue(variable.getPassword()).into(password));
Thread.sleep(10000);

actor.attemptsTo(
        Click.on(loginButton));
Thread.sleep(5000);

    }
}
