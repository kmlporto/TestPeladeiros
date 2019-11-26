package edu.ifpb.peladeiros.page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageInitial extends PageBase<PageInitial> {

    @AndroidFindBy(accessibility = "signin_email")
    public MobileElement inputTextEmail;

    @AndroidFindBy(accessibility = "signin_senha")
    public MobileElement inputTextSenha;

    @AndroidFindBy(accessibility = "signin_entrar")
    public MobileElement buttonEntrar;

    @AndroidFindBy(accessibility = "signin_criar")
    public MobileElement buttonCriarConta;

    public PageInitial setInputEmail(String email){
        sendText(inputTextEmail, email);
        return this;
    }

    public PageInitial setInputSenha(String senha){
        sendText(inputTextSenha, senha);
        return this;
    }

    public PageInitial clickOnBtnEntrar(){
        waitAndClickOnButton(buttonEntrar);
        return this;
    }

    public PageInitial clickOnBtnCriarConta(){
        waitAndClickOnButton(buttonCriarConta);
        return this;
    }
}
