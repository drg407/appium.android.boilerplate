package appium.android.boilerplate.core;

import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Utility extends Base {
    public static MobileElement visibilityOf(MobileElement mobileElement) {
        return (MobileElement) wait.until(ExpectedConditions.visibilityOf(mobileElement));
    }

    public static void scrollByIDAndClick(MobileElement mobileElement) {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\""
                            + mobileElement + "\"));"))
                    .click();
        } catch (Exception e) {
            // Ignore
        }
    }
}