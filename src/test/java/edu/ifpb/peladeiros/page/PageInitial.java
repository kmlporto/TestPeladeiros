package edu.ifpb.peladeiros.page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageInitial extends PageBase<PageInitial> {


    @AndroidFindBy(accessibility = "entrarBtn")
    public MobileElement buttonEntrar;


    public PageInitial clickOnBtnEntrar(){
        waitAndClickOnButton(buttonEntrar);
        return this;
    }
}
