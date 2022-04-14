package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BasePageObject {

    public SelenideElement buttonDetailInfo = $x("//button[@id='detail-information-row-action-table-0']"); // First Row Rate Data
}
