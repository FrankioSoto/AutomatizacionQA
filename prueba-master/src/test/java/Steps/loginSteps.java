package Steps;

import Interfaces.loginPage;
import Models.loginModel;
import Questions.answersLogin;
import Tasks.loginTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class loginSteps {
    @Managed(driver = "chrome")
    WebDriver driver;
    loginModel model = new loginModel();
    loginPage model2 = new loginPage();
    private final Actor actor = Actor.named("identity");
    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("user is on login pages")
    public void loginPage() {
    }
    @When("user enter Username {string} and password {string}")
    public void userEnterUsernameAndPassword(String arg0, String arg1) {

        actor.wasAbleTo(Open.browserOn(model2));
        this.model.setUser(arg0);
        this.model.setPassword(arg1);
        actor.attemptsTo(
                loginTask.login(model));
    }

    @Then("user in on polarix page with {string}")
    public void userInOnPolarixPage(String arg0) {
        actor.attemptsTo(
                Ensure.that(answersLogin.answersLoginMethod()).isEqualTo(arg0)
        );
}
}
