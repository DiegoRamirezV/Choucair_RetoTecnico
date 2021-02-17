package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastStepPage {
    public static final Target INPUT_PASSWORD = Target.the("Field for the user's password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRMPASSWORD = Target.the("Field to conffirm the user's password")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_CONDUCT = Target.the("Checkbox to accept the Terms of Use")
            .located(By.xpath("//span[@ng-class='{error: userForm.termOfUse.$error.required}']"));
    public static final Target CHECKBOX_PRIVACY = Target.the("Checkbox to accept the Privacy and Security Policy")
            .located(By.xpath("//span[@ng-class='{error: userForm.privacySetting.$error.required}']"));
    public static final Target BUTTON_FINISH = Target.the("Button that completes user registration")
            .located(By.id("laddaBtn"));
    public static final Target WELCOME = Target.the("Welcome once the user has registered")
            .located(By.className("sub-title"));
}
