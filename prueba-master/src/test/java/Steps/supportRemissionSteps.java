package Steps;

import Interfaces.supportRemissionPage;
import Models.supportRemissionModel;
import Tasks.supportRemissionTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class supportRemissionSteps {
    @Managed(driver = "chrome")
    WebDriver driver;
    supportRemissionModel model1 = new supportRemissionModel();
    supportRemissionPage model2 = new supportRemissionPage();
    private final Actor actor = Actor.named("verify");
    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @When("user goes to verify the guide with branch name {string} and guide {string} and input guide {string} and input guide 2 {string}")
    public void userGoesToVerifyTheGuide(String arg0, String arg1, String arg2, String arg3) {

      actor.wasAbleTo(Open.browserOn(model2));
        this.model1.setBranchName(arg0);
        this.model1.setGuide(arg1);
        this.model1.setInputGuide(arg2);
        this.model1.setInputGuide2(arg3);

        actor.attemptsTo(
                supportRemissionTask.support(model1));
    }
    @Then("user goes to see the support")
    public void userGoesToSeeDetail() {
    }
}
