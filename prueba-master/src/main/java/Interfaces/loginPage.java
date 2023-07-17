package Interfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://pruebas.kairosplus.com.co/user/login")
public class loginPage extends PageObject {
    public static final Target user = Target.the("This the input user").located(By.id("identity"));
    public static final Target password = Target.the("This the input password").located(By.id("credential"));
    public static final Target loginButton= Target.the("This the login button").locatedBy("//button[contains(text(),'Entrar')]");
    public static final Target answersByText= Target.the("This the answers page").locatedBy("//*[@id=\"headerPrincipal\"]/div[2]/ul[1]/li[1]/a");








}
