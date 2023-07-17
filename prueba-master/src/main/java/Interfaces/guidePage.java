package Interfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://pruebas.kairosplus.com.co/user/login")
public class guidePage extends PageObject {

    public static final Target mailClient = Target.the("This the mails client").locatedBy("//a[contains(text(),'Clientes Correo')]");
    public static final Target search = Target.the("This the search").locatedBy("//*[@id=\"content\"]/div/ul/li[3]/a");
    public static final Target searchGuide = Target.the("This the search guide").locatedBy("//*[@id=\"tabbusqueda\"]/li[5]/a");
    public static final Target enterGuide = Target.the("This the input guide").located(By.id("idguia"));
    public static final Target buttonSearchGuide = Target.the("This the button search guide").located(By.id("submitbutton"));
    public static final Target numberGuide = Target.the("This the number guide").locatedBy("/html/body/div[2]/div[1]/div/div/form/div/div/div[2]/div[15]/div[1]/table/tbody/tr/td[1]/a");
    public static final Target orderLocation = Target.the("This the order location ").locatedBy("//*[@id=\"detalleguia\"]/div/div[1]/div[1]/table/tbody/tr/td[6]");









}
