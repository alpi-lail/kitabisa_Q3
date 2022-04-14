package pages;


import com.codeborne.selenide.SelenideElement;
import pages.BasePageObject;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class registrationPage extends BasePageObject {

    // Forms - Input Registration
    public SelenideElement inputEmail = $(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/form/div[1]/div/div/input"));
    public SelenideElement inputNama = $(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/form/div[2]/div/div/input"));

    // Elements - Buttons
    public SelenideElement buttonDaftar = $x("//*[@id=\"__next\"]/div[1]/div/div[2]/form/div[3]");

    // Overlays - Modals
    public SelenideElement modalWarning = $x("//div[@class='text-muted lead'][contains(.,'You should immediately change your password')]");

    // Overlays - Notifications
    public SelenideElement notifInvalidUserPass = $x("//div[@class='alert alert-danger fade show'][contains(.,'Invalid username or password')]");

}
