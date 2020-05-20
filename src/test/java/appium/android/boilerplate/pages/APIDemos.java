package appium.android.boilerplate.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import appium.android.boilerplate.core.Base;
import appium.android.boilerplate.core.Utility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class APIDemos extends Base {

    public APIDemos(final AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // Sample xpath selector
    @FindBy(xpath = "//android.widget.TextView[@text='Views']")
    public MobileElement viewsButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Animation']")
    public MobileElement animationButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Preference']")
    public MobileElement preferenceButton;

    @FindBy(xpath = "//android.widget.TextView[@text='3. Preference dependencies']")
    public MobileElement preferenceDependenciesButton;

    // Sample id selector
    @FindBy(id = "android:id/checkbox")
    public MobileElement checkbox;

    // Sample xpath selector by index
    @FindBy(xpath = "(//android.widget.RelativeLayout)[2]")
    public MobileElement wifiSettingsButton;

    // Sample className selector
    @FindBy(className = "android.widget.EditText")
    public MobileElement textBox;

    // Sample className button selector
    @FindBy(className = "android.widget.Button")
    public MobileElement button;

    // Reusable method for common action hardcoded element
    public void clickViewsButton() {
        Utility.visibilityOf(viewsButton).click();
    }

    public void clickPreferenceButton() {
        Utility.visibilityOf(preferenceButton).click();
    }

    public void clickPreferenceDependenciesButton() {
        Utility.visibilityOf(preferenceDependenciesButton).click();
    }

    public void clickCheckbox() {
        Utility.visibilityOf(checkbox).click();
    }

    public void clickWifiSettingsButton() {
        Utility.visibilityOf(wifiSettingsButton).click();
    }

    // Reusable method for sending string text to EditText class
    public void fillTextBox(final String string) {
        Utility.visibilityOf(textBox).sendKeys(string);
    }

    // Reusable method for common action abstract element
    public void clickElement(final MobileElement mobileElement) {
        Utility.visibilityOf(mobileElement).click();
    }

    // TODO This method needs abstraction to accept any element instead of a
    // hardcoded selector.
    public void clickButtonByIndex(Integer index) {
        driver.findElements(By.className("android.widget.Button")).get(index).click();
    }
}