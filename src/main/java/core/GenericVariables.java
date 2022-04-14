package core;

public interface GenericVariables {
    propertiesReader PropertiesReader = new propertiesReader();

    // URL
    String kitabisaUrl = PropertiesReader.getProperties("application.kitabisa.url");


    // User Data Loader
    String email = PropertiesReader.getProperties("HpEmail");
    String nama = PropertiesReader.getProperties("nama");

    // Selenium Configuration
    String browser = PropertiesReader.getProperties("selenium.browser");
    String maximizedWindow = PropertiesReader.getProperties("selenium.maximized.window");
    String headlessConfig = PropertiesReader.getProperties("selenium.headless");
    String screenshotConfig = PropertiesReader.getProperties("selenium.failure.screenshot");
    String pageSource = PropertiesReader.getProperties("selenium.failure.save.page.source");
    String timeout = PropertiesReader.getProperties("selenium.timeout.milliseconds");

}
