package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.AboutPage;
import co.com.choucair.certification.retotecnico.userinterface.DevicesPage;
import co.com.choucair.certification.retotecnico.userinterface.LastStepPage;
import co.com.choucair.certification.retotecnico.userinterface.LocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillOut implements Task {

    private String strFirstname;
    private String strLastname;
    private String strEmail;
    private String strBirthMonth;
    private String strBirthDay;
    private String strBirthYear;
    private String strPassword;

    public FillOut(String strFirstname, String strLastname, String strEmail, String strBirthMonth, String strBirthDay,
                   String strBirthYear, String strPassword) {
        this.strFirstname = strFirstname;
        this.strLastname = strLastname;
        this.strEmail = strEmail;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
        this.strPassword = strPassword;
    }

    public static FillOut onThePage(String strFirstname, String strLastname, String strEmail, String strBirthMonth,
                                    String strBirthDay, String strBirthYear, String strPassword){
        return Tasks.instrumented(FillOut.class, strFirstname, strLastname, strEmail, strBirthMonth, strBirthDay,
                                    strBirthYear, strPassword);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strFirstname).into(AboutPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastname).into(AboutPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(AboutPage.INPUT_EMAIL),
                Click.on(AboutPage.MENU_BD_MONTH),
                Click.on("[label="+ strBirthMonth +"]"),
                Click.on(AboutPage.MENU_BD_DAY),
                Click.on("[label='"+ strBirthDay +"']"),
                Click.on(AboutPage.MENU_BD_YEAR),
                Click.on("[label='"+ strBirthYear +"']"),
                Click.on(AboutPage.BUTTON_LOCATION),
                Click.on(LocationPage.BUTTON_DEVICES),
                Click.on(DevicesPage.BUTTON_LASTSTEP),
                Enter.theValue(strPassword).into(LastStepPage.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(LastStepPage.INPUT_CONFIRMPASSWORD),
                Click.on(LastStepPage.CHECKBOX_CONDUCT),
                Click.on(LastStepPage.CHECKBOX_PRIVACY),
                Click.on(LastStepPage.BUTTON_FINISH)

        );

    }
}
