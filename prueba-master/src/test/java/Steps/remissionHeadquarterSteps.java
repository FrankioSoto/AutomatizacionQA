package Steps;

import Models.remissionHeadquartersModel;
import Tasks.remissionHeadquarterTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class remissionHeadquarterSteps {
    @Managed(driver = "chrome")
    WebDriver driver;

    remissionHeadquartersModel model = new remissionHeadquartersModel();
    //remissionHeadquarterPage model2 = new remissionHeadquarterPage();
    private final Actor actor = Actor.named("Usuario");

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }


    @And("remission departure to headquarters with number guide {string}")
    public void remissionDepartureToHeadquartersWithNumberGuide(String arg0) {
        this.model.setGuideNumberRemission(arg0);
        actor.attemptsTo(
                remissionHeadquarterTask.remission(model));
    }
}


