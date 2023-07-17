package Tasks;

import Interactions.supportRemissionInteraction;
import Models.supportRemissionModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

@AllArgsConstructor
public class supportRemissionTask implements Task {

    public static supportRemissionTask support (supportRemissionModel variable2){
        return new supportRemissionTask(variable2);
    }
    private final supportRemissionModel variable2;

    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                supportRemissionInteraction.supportMethod(variable2)
        );
    }
}
