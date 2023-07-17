package Steps;

import Interfaces.couriersupportPage;
import Interfaces.supportPage;
import Models.couriersupportModel;
import Models.supportModel;
import Tasks.couriersupportTask;
import Tasks.supportTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class couriersupportSteps {
    @Managed(driver = "chrome")
    WebDriver driver;

    couriersupportModel model = new couriersupportModel();
    couriersupportPage model2 = new couriersupportPage();
    private final Actor actor = Actor.named("actor");
    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @And("user write the courierSupport {string} and support {string} whit guide {string}")
    public void userCheckGuide(String arg0, String arg1, String arg2) {
        actor.wasAbleTo(Open.browserOn(model2));
        this.model.setCourierSupport(arg0);
        this.model.setSupport(arg1);
        this.model.setGuide(arg2);
                actor.attemptsTo(
                        couriersupportTask.courier(model));
    }
}