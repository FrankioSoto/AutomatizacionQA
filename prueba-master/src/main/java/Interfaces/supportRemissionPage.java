package Interfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("https://pruebas.kairosplus.com.co/user/login")
public class supportRemissionPage extends PageObject {

    public static final Target admin = Target.the("This the admin").locatedBy("//a[contains(text(),'Administracion')]");
    public static final Target support = Target.the("This the support").locatedBy("//a[contains(text(),'Soportes')]");
    public static final Target newSupport = Target.the("This the create new support").locatedBy("//a[contains(text(),'Crear Nuevo Soporte (Manifiesto)')]");
    public static final Target materialSupport = Target.the("This the material support").locatedBy("//*[@id=\"contenido\"]/fieldset[1]/button[2]");
    public static final Target branch = Target.the("This the branch").locatedBy("//*[@id=\"idsedetraslado_chosen\"]");
    public static final Target branchName = Target.the("This the branch name").locatedBy("//*[@id=\"idsedetraslado_chosen\"]/div/div/input");
    public static final Target save = Target.the("This the save button").locatedBy("//*[@id=\"enviar\"]/table/tbody/tr[4]/td/input");
    public static final Target destinationBranch = Target.the("This the destination branch").locatedBy("//*[@id=\"contenido\"]/div[1]/table/tbody/tr[1]/td[4]/button[1]");
    public static final Target inputGuide = Target.the("This the input guide").locatedBy("//*[@id=\"idguia\"]");
    public static final Target refresh = Target.the("This the refresh").locatedBy("//*[@id=\"btnrefrescar\"]");
    public static final Target managerDelivery = Target.the("This the manager delivery").locatedBy("//*[@id=\"contenido\"]/div[1]/table/tbody/tr[1]/td[4]/button[2]");
    public static final Target inputGuide2 = Target.the("This the input guide 2").locatedBy("//*[@id=\"idguia\"]");


}
