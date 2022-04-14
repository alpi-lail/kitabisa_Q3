package stepdefinition;



import core.seleniumConfig;
import helper.seleniumHelper;
import pages.BasePageObject;
import pages.registrationPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.sleep;

    public class commonStepDef extends seleniumHelper {

        private final BasePageObject basePageObject = new BasePageObject();
        private final registrationPage RegistrationPage = new registrationPage();
        private final registrationStepDef RegistrationStepDef = new registrationStepDef();

        @Before("@loadConfig")
        public void seleniumInitConfig() {
            seleniumConfig.initConfiguration();
            writeLog("Load configuration from Selenium Config");
        }
}
