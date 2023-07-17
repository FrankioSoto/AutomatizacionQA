package Questions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static Interfaces.loginPage.answersByText;

@AllArgsConstructor
public class answersLogin {
    public static Question<String> answersLoginMethod () {
        return actor -> BrowseTheWeb.as(actor).find(answersByText).getText();
    }

}