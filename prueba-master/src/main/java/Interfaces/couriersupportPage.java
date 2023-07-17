package Interfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://pruebas.kairosplus.com.co/user/login")
public class couriersupportPage extends PageObject {
    public static final Target administration = Target.the("This the click administration").locatedBy("//a[contains(text(),'Administracion')]");
    public static final Target support = Target.the("This the click support").locatedBy("//a[contains(text(),'Soportes')]");
    public static final Target optionNewSupport = Target.the("This the option new support").locatedBy("/html/body/div[2]/div[1]/div/div[1]/p/a");
    public static final Target supportCourierAllied = Target.the("This the support check").locatedBy("/html/body/div[2]/div[1]/div/div[1]/fieldset[1]/button[5]");
    public static final Target courierSupport = Target.the("This the support name").located(By.id("idsoporte2"));
    public static final Target selectCourier = Target.the("This the select store").located(By.id("idcourrieraliado"));
    public static final Target saveButton = Target.the("This the save button").located(By.id("submitbutton"));

    public static final Target guide = Target.the("This the id guide").located(By.id("codigo"));
    public static final Target answerByText = Target.the("This the answer by text").locatedBy("/html/body/div[1]/div[2]/ul[1]/li[1]/a");





}