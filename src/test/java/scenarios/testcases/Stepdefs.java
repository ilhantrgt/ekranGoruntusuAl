package scenarios.testcases;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pageobjects.LoginPageObjects;
import scenarios.base.StepManager;


public class Stepdefs extends StepManager  {
    private LoginPageObjects loginPage;
    public Stepdefs() {
        super("application");
        loginPage = PageFactory.initElements(this.driver, LoginPageObjects.class);
        set_timeOutValue(10);
    }

    @When("^Ana Sayfayı Aç$")
    public void anaSayfayıAç() {
        getUrl();

    }

    @And("^Login Ol ve SPI Sayfasına Tıkla$")
    public void loginOlVeSPISayfasınaTıkla() {
    }

    @Then("^Ekran Görüntüsü Al$")
    public void ekranGörüntüsüAl() {
        takeScreenshot();
    }
}
