package edu.ifpb.peladeiros.page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageHome extends PageBase<PageHome>{

    @AndroidFindBy(xpath = ".//*[@text='DETALHES']")
    public MobileElement detalhes;

}
