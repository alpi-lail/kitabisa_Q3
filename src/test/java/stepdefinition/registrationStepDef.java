package stepdefinition;

import com.codeborne.selenide.Condition;
import core.GenericVariables;
import helper.seleniumHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.registrationPage;
import pages.otpPage;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import org.openqa.selenium.WebDriver;


public class registrationStepDef extends seleniumHelper {

        private final registrationPage RegistrationPage = new registrationPage();
        private final otpPage OtpPage = new otpPage();

        @Given("user open browser URL")
        public void openBrowser() {
            open("https://accounts.kitabisa.com/register");
            System.out.println("User navigate to the open browser");
            sleep(600);

        }

        @When("user input hpEmail")
        public void userInputHpEmail() {
            RegistrationPage.inputEmail.setValue(email);
            System.out.println("User navigate to input hpEmail");
            sleep(600);

        }

        @And("user input namalengkap")
        public void userInputNamalengkap() {
            RegistrationPage.inputNama.setValue(nama);
            System.out.println("User navigate to input namalengkap");
            sleep(600);
        }

        @And("click daftar button")
        public void clickDaftarButton() {
            RegistrationPage.buttonDaftar.click();
            System.out.println("User navigate to click daftar button");
            sleep(600);

        }

        @And("user entered otp page")
        public void userEnteredOtpPage() {
            OtpPage.titleotpPage.shouldBe(Condition.exist);
            System.out.println("User navigate to entered otp page");
            sleep(600);
        }

    @When("^user input Email as ([^\"]*) and nama as ([^\"]*)$")
    public void userInputEmailAsAnd(String email, String namalengkap) throws Throwable {
            RegistrationPage.inputEmail.setValue(email);
            RegistrationPage.inputNama.setValue(namalengkap);
            System.out.println("Email is : "+ email);
            System.out.println("NamaLengkap is : "+ namalengkap);
            sleep(1000);
    }
}
