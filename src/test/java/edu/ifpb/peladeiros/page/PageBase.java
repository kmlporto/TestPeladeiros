package edu.ifpb.peladeiros.page;

import edu.ifpb.peladeiros.arquitetura.drive.TLDriverFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase<T> {
    protected AppiumDriver driver;
    protected WebDriverWait wait;

    public PageBase(){
        this.driver = TLDriverFactory.getDriver();
        wait = TLDriverFactory.getWait(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    protected void waitAndClickOnButton(MobileElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    protected MobileElement waitAndGetElement(MobileElement element){
        return (MobileElement) wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void sendText(MobileElement element, String text){
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    protected String getText(MobileElement element){
        return wait.until(ExpectedConditions.visibilityOf(element)).getText();
    }

    public boolean isElementEnabled(String elementName) {
        try {
            MobileElement el = (MobileElement) this.driver.findElementsByAccessibilityId(elementName);
            return el.isEnabled();
        }
        catch (Exception e){
            return false;
        }
    }

}
