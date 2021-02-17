package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesPage {
    public static final Target BUTTON_LASTSTEP = Target.the("Button that takes us to the Final Step page")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
