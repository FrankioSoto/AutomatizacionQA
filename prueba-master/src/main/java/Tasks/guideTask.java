package Tasks;

import Interactions.guideInteraction;
import Interactions.loginInteraction;
import Models.guideModel;
import Models.loginModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

@AllArgsConstructor
public class guideTask implements Task {

    public static guideTask guide (guideModel variable2){
        return new guideTask(variable2);
    }
    private final guideModel variable2;

    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                guideInteraction.guideMethod(variable2)
        );
    }
}
