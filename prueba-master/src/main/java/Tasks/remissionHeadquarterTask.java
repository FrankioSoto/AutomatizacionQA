package Tasks;

import Interactions.remissionHeadquartersInteraction;
import Interactions.supportInteraction;
import Models.remissionHeadquartersModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;


@AllArgsConstructor
public class remissionHeadquarterTask implements Task {

    public static remissionHeadquarterTask remission (remissionHeadquartersModel variable){
        return new remissionHeadquarterTask(variable);
    }

    private final remissionHeadquartersModel variable;


    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                remissionHeadquartersInteraction.headquartersMethod(variable));
    }
}
