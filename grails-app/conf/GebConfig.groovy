import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.remote.DesiredCapabilities

driver = {
    new RemoteWebDriver(new DesiredCapabilities())
}
reportsDir = "target/geb-reports"