package Interfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://pruebas.kairosplus.com.co/user/login")

public class zonePage extends PageObject {
    public static final Target admin1 = Target.the("This the  Admin").locatedBy("//body[1]/div[1]/div[2]/ul[1]/li[2]/a[1]");

    public static final Target Supportt = Target.the("This the  Support").locatedBy("//body[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]");

    public static final Target newSupportt = Target.the("This the  new Support").locatedBy("//body[1]/div[2]/div[1]/div[1]/div[1]/p[1]/a[1]");

    public static final Target newZone = Target.the("This the  new zone").locatedBy("//body[1]/div[2]/div[1]/div[1]/div[1]/fieldset[1]/button[1]");

    public static final Target clickCampus = Target.the("This the  new zone").locatedBy("//body[1]/div[2]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]");

    public static final Target campus = Target.the("This the  campus").locatedBy("/html/body/div[2]/div[1]/div/div[1]/form/table/tbody/tr[1]/td[2]/div/div/div/input");

    public static final Target clickUnit = Target.the("This the  unit business").locatedBy("//body[1]/div[2]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]");

    public static final Target Unit = Target.the("Write unit").locatedBy("/html/body/div[2]/div[1]/div/div[1]/form/table/tbody/tr[2]/td[2]/div/div/div/input");

    public static final Target deliveryCourier = Target.the("This the click the deliveryCourier").locatedBy("//body[1]/div[2]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]");

    public static final Target clickDeliveryCourier = Target.the("This the write the click deliveryCourier").locatedBy("/html/body/div[2]/div[1]/div/div[1]/form/table/tbody/tr[3]/td[2]/div/div/div/input");

    public static final Target save = Target.the("This the save").locatedBy("//body[1]/div[2]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[7]/td[1]/button[1]");

    public static final Target guide = Target.the("This the guide").locatedBy("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/form[1]/input[1]");

    public static final Target refresh = Target.the("This the refresh").locatedBy("//body[1]/div[2]/div[1]/div[1]/div[1]/p[1]/button[1]");

    public static final Target liquidate = Target.the("This the liquidate").locatedBy("//body[1]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]");

    public static final Target place = Target.the("This the place").locatedBy("/html/body/div/div/form/div/table/tbody/tr[2]/td[2]/div/div/div/input");

    public static final Target guideSupport = Target.the("This the guideSupport").locatedBy("//body[1]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/div[1]/input[1]");

    public static final Target guideTwo = Target.the("This the clickSave").locatedBy("/html/body/div/div/form/div/table/tbody/tr[2]/td[4]/div[1]/input");

}