package Steps;

//import Interfaces.changesPage;
import Interfaces.zonePage;
//import Models.changesModel;
import Models.zoneModel;
//import Tasks.changeTask;
import Tasks.zoneTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class zoneSteps {
    @Managed(driver = "chrome")
    WebDriver driver;


    zoneModel model7 = new zoneModel();
    zonePage model8 = new zonePage();
    private final Actor actor = Actor.named("zoneguide");

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }


    @When("user search the support {string} Unit {string} ClickDeliveryCourier {string} guide {string} NumerSupport {string} place {string} guideTwo {string}")
    public void userWriteTheZone(String arg0, String arg01, String arg02, String arg03, String arg04, String arg05, String arg06) {

            actor.wasAbleTo(Open.browserOn(model8));
            this.model7.setCampus(arg0);
            this.model7.setUnit(arg01);
            this.model7.setClickDeliveryCourier(arg02);
            this.model7.setGuide(arg03);
            this.model7.setNumerSupport(arg04);
            this.model7.setPlace(arg05);
            this.model7.setGuideTwo(arg06);

                        actor.attemptsTo(
                    zoneTask.zone(model7));
        }


}

