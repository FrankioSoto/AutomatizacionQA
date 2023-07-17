package Interfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://pruebas.kairosplus.com.co/user/login")
public class remissionHeadquartersPage extends PageObject {
    public static final Target administrationButton1 = Target.the("This the administration button").locatedBy("/html/body/div[1]/div[2]/ul[1]/li[2]/a");
    public static final Target supports1 = Target.the("This the support button").locatedBy("/html/body/div[2]/div[1]/div/ul/li[3]/a");
    public static final Target newManifest1 = Target.the("This the new manifest").locatedBy("/html/body/div[2]/div[1]/div/div[1]/p/a");
    public static final Target remissionHeadquarters = Target.the("This the remissionHeadquarters").locatedBy("/html/body/div[2]/div[1]/div/div[1]/fieldset[1]/button[3]");

    public static final Target originBusinessUnit = Target.the("This the remissionHeadquarters").located(By.id("idsubsede_origen"));

    public static final Target destinyBusinessUnit = Target.the("This the destinyBusinessUnit").located(By.id("idsubsede_destino"));
    public static final Target submitbutton = Target.the("submitbutton").located(By.id("submitbutton"));
    public static final Target manifestHeadquearters = Target.the("submitbutton").locatedBy("/html/body/div[2]/div[1]/div/div[1]/div[1]/table/tbody/tr[1]/td[4]/button[1]");


    public static final Target manifestNumberHead = Target.the("manifestNumberHeadquarters").locatedBy("/html/body/div[2]/div[1]/div/div[1]/div[1]/table/tbody/tr[1]/td[1]");
    public static final Target inputGuideRemission = Target.the("input Guide Remission").located(By.id("idguia"));
}
