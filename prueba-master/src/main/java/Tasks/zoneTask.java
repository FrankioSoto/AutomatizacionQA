package Tasks;
//import Interactions.stateChanges;
import Interactions.zone;
//import Models.changesModel;
import Models.zoneModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

@AllArgsConstructor
public class zoneTask implements Task {

    public static zoneTask zone (zoneModel variable4){
        return new zoneTask(variable4);
    }
    private final zoneModel variable4;

    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                zone.zoneMethod(variable4));
    }
}
