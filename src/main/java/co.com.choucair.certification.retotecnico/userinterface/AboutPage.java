package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AboutPage {
    public static final Target INPUT_FIRSTNAME = Target.the("Field for the user's first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Field for the user's last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Field for the user's email")
            .located(By.id("email"));
    public static final Target MENU_BD_MONTH = Target.the("Menu to choose the user's birthday month")
            .located(By.id("birthMonth"));
    public static final Target MENU_BD_DAY = Target.the("Menu to choose the user's birthday day")
            .located(By.id("birthDay"));
    public static final Target MENU_BD_YEAR = Target.the("Menu to choose the user's birthday year")
            .located(By.id("birthYear"));
    public static final Target BUTTON_LOCATION = Target.the("Button that takes us to the Location page")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
