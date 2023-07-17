package Tasks;

import Interactions.guideInteraction;
import Interactions.supportInteraction;
import Models.guideModel;
import Models.orderModel;
import Models.supportModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

@AllArgsConstructor
public class supportTask implements Task {

    public static supportTask support (supportModel variable2, orderModel variable3){
        return new supportTask(variable2, variable3);
    }
    private final supportModel variable2;
    private final orderModel variable3;


    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                supportInteraction.supportMethod(variable2, variable3)
        );
    }
}
