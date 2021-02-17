package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationPage {
    public static final Target BUTTON_DEVICES = Target.the("Button that takes us to the Devices page")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
