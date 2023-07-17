package Tasks;

import Interactions.couriersupportInteraction;
import Interactions.supportInteraction;
import Models.couriersupportModel;
import Models.supportModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

@AllArgsConstructor
public class couriersupportTask implements Task {

    public static couriersupportTask courier (couriersupportModel alliedCourier){
        return new couriersupportTask(alliedCourier);
    }
    private final couriersupportModel alliedCourier;

    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                couriersupportInteraction.courierMethod(alliedCourier)
        );
    }
}