package Steps;

import Interfaces.guidePage;
import Interfaces.loginPage;
import Models.guideModel;
import Models.loginModel;
import Tasks.guideTask;
import Tasks.loginTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class guideSteps {
    @Managed(driver = "chrome")
    WebDriver driver;
    guideModel model1 = new guideModel();
    guidePage model2 = new guidePage();
    private final Actor actor = Actor.named("identity");
    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @When("user goes to see guide detail {string}")
    public void userGoesToSeeGuideDetail(String arg0) {

        actor.wasAbleTo(Open.browserOn(model2));
        this.model1.setGuide(arg0);
        actor.attemptsTo(
                guideTask.guide(model1));
    }
    @Then("user goes to see the detail")
    public void userGoesToSeeDetail() {
    }
}
