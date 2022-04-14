package helper;

import java.util.logging.Logger;


    import core.GenericVariables;
    import org.openqa.selenium.Keys;
    import java.util.logging.Logger;
    import static com.codeborne.selenide.Selenide.$;
    import static org.assertj.core.api.Assertions.assertThat;

    public class seleniumHelper implements GenericVariables {

        // Logger
        protected final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        public void writeLog(String message) {
            LOGGER.info(message);
        }

        // Assertion
        public void assertStringResult(String actual, String expected, String errorMessage) {
            assertThat(actual).withFailMessage(errorMessage).isEqualTo(expected);
        }

        // Selenium Method
        public void scrollDown() {
            $("body").sendKeys(Keys.PAGE_DOWN);
        }

        public void escape() {
            $("body").sendKeys(Keys.ESCAPE);
        }
}
