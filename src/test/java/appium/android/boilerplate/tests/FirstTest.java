package appium.android.boilerplate.tests;

import org.testng.annotations.Test;

import appium.android.boilerplate.core.Base;

public class FirstTest extends Base {

    @Test
    public void clickViews() {
        apiDemos.clickViewsButton();
    }

}