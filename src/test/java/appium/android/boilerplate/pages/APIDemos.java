package appium.android.boilerplate.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import appium.android.boilerplate.core.Utility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class APIDemos {

    public APIDemos(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Views']")
    public MobileElement viewsButton;

    public void clickViewsButton() {
        Utility.visibilityOf(viewsButton).click();
    }

}