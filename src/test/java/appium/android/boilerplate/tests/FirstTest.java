package appium.android.boilerplate.tests;

import org.testng.annotations.Test;

import appium.android.boilerplate.core.Base;

public class FirstTest extends Base {

    @Test
    public void clickDemo() {
        apiDemos.clickPreferenceButton();
        apiDemos.clickElement(apiDemos.preferenceDependenciesButton);
        apiDemos.clickCheckbox();
        apiDemos.clickWifiSettingsButton();
        apiDemos.fillTextBox("TEST");
        apiDemos.clickButtonByIndex(1);
    }

}