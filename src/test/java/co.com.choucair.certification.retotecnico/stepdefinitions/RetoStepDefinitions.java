package co.com.choucair.certification.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.model.RetoData;
import co.com.choucair.certification.retotecnico.questions.Answer;
import co.com.choucair.certification.retotecnico.tasks.FillOut;
import co.com.choucair.certification.retotecnico.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RetoStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Diego wants to sign up on the platform of software testers$")
    public void diegoWantsToSignUpOnThePlatformOfSoftwareTesters() {
        OnStage.theActorCalled("Diego").wasAbleTo(OpenUp.thePage());
    }

    @When("^he sends the required information for registration$")
    public void heSendsTheRequiredInformationForRegistration(List<RetoData> retoData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(FillOut.onThePage(retoData.get(0).getStrFirstname(),
                        retoData.get(0).getStrLastname(), retoData.get(0).getStrEmail(),
                        retoData.get(0).getStrBirthMonth(), retoData.get(0).getStrBirthDay(),
                        retoData.get(0).getStrBirthYear(), retoData.get(0).getStrPassword()
                        )
                );
    }

    @Then("^he receives the welcome and confirmation of his new account$")
    public void heReceivesTheWelcomeAndConfirmationOfHisNewAccount(List<RetoData> retoData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(retoData.get(0).getStrWelcome())));
    }
}

