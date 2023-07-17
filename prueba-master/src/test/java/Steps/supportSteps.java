package Steps;

import Interactions.captureOrder;
import Interfaces.supportPage;
import Models.orderModel;
import Models.supportModel;
import Tasks.supportTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class supportSteps {
    @Managed(driver = "chrome")
    WebDriver driver;
    supportModel model1 = new supportModel();
    supportPage model2 = new supportPage();
    private final Actor actor = Actor.named("verify");
    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @When("user goes to verify the guide with input support {string} and card id {string}")
    public void userGoesToVerifyTheGuide(String arg0, String arg1) {

        actor.wasAbleTo(Open.browserOn(model2));
        this.model1.setInputSupport(arg0);
        this.model1.setCardId(arg1);
        orderModel orderVariab = captureOrder.order();

        actor.attemptsTo(
                supportTask.support(model1, orderVariab));
    }
}
