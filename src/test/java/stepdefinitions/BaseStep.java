package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.stablex.utils.DriverManager;
import org.stablex.utils.Pages;

public class BaseStep {

	protected final Pages PAGES = new Pages();

	protected final WebDriver DRIVER = DriverManager.getDriver();

}
