# appium.android.boilerplate

Java Appium Boilerplate for Android

This is a boilerplate project that uses Appium 7.1.0 and Java 8. It includes examples of the PageObject pattern and some practical examples for using Appium to build an automated test suite with TestNG.

## Getting Started

```code
git clone https://github.com/drg407/appium.android.boilerplate.git
```

## Page Objects

Page Objects are abstractions for the UI elements that you interact with in your tests. You can create getter functions for each element that you need to access. You can create convenient methods like `clickViewsButton()` which allow you to write more concise tests.

### `src/test/java/appium/android/boilerplate/pages/APIDemos.java`

```java
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
```

### `src/test/java/appium/android/boilerplate/tests/FirstTest.java`

```java
package appium.android.boilerplate.tests;

import org.testng.annotations.Test;

import appium.android.boilerplate.core.Base;

public class FirstTest extends Base {

    @Test
    public void clickViews() {
        apiDemos.clickViewsButton();
    }

}
```

## Test examples

The tests in this project use Appium's ApiDemos-debug.apk to demonstrate how to interact with some of the most common UI elements you will encounter. I will try to add more from time to time. These tests can be executed with testNG.

## Programmatically start Android AVD

//TODO

## Programmatically start appium server

//TODO

## CI examples

//TODO

## Reporters

//TODO
