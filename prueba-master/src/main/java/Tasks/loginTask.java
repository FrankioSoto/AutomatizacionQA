package Tasks;

import Interactions.loginInteraction;
import Models.loginModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

@AllArgsConstructor
public class loginTask implements Task {

    public static loginTask login (loginModel variable){
        return new loginTask(variable);
    }
    private final loginModel variable;

    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                loginInteraction.loginMethod(variable)
        );
    }
}
