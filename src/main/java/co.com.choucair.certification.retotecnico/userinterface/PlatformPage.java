package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class PlatformPage extends PageObject{

    public static final Target JOIN_BUTTON = Target.the("button that takes us to the registration process")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
}

