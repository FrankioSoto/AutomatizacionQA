package Interfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://pruebas.kairosplus.com.co/user/login")
public class supportPage extends PageObject {

    public static final Target admin = Target.the("This the admin").locatedBy("//*[@id=\"headerPrincipal\"]/div[2]/ul[1]/li[2]/a");
    public static final Target support = Target.the("This the support").locatedBy("/html/body/div[2]/div[1]/div/ul/li[4]/a");
    public static final Target newSupport = Target.the("This the create new support").locatedBy("//a[contains(text(),'Crear Nuevo Soporte (Manifiesto)')]");
    public static final Target materialSupport = Target.the("This the material support").locatedBy("//body/div[2]/div[1]/div[1]/div[1]/fieldset[2]/button[3]");
    public static final Target inputSupport = Target.the("This the input support").locatedBy("//input[@id='idsoporte2']");
    public static final Target searchOrder = Target.the("This the search order").locatedBy("//input[@id='idorden']");
    public static final Target selectClient = Target.the("This the select client").locatedBy("//select[@id='idempresa']");
    public static final Target selectStore = Target.the("This the select store").locatedBy("//select[@id='idbodega']");
    public static final Target save = Target.the("This the save button").locatedBy("//input[@id='submitbutton']");
    public static final Target card = Target.the("This the card vs").locatedBy("/html/body/div[2]/div[1]/div/div[1]/div[1]/table/tbody/tr[1]/td[4]/button");
    public static final Target cardId = Target.the("This the card vs").locatedBy("/html/body/div/div/form/table/tbody/tr[2]/td[2]/input");
    public static final Target plucking = Target.the("This the plucking button").locatedBy("/html/body/div/div/form/table/tbody/tr[3]/td/input");
    public static final Target returnNumber = Target.the("This the return number").locatedBy("//*[@id=\"contenido\"]/div[1]/table/tbody/tr[1]/td[1]");
    public static final Target manifestNumber = Target.the("This the verified").locatedBy("/html/body/div[2]/div[1]/div/div[1]/div[1]/table/tbody/tr[1]/td[1]");
    public static final Target refresh = Target.the("This the verified").locatedBy("//*[@id=\"btnrefrescar\"]");







}
