package edu.ifpb.peladeiros.page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageCreateAnCount extends PageBase<PageCreateAnCount>{
    @AndroidFindBy(accessibility = "signup_nome")
    public MobileElement inputTextNome;

    @AndroidFindBy(xpath = ".//*[@text='Data de nascimento']")
    public MobileElement elementCalendario;

    @AndroidFindBy(accessibility = "signup_username")
    public MobileElement inputTextUserName;

    @AndroidFindBy(accessibility = "signup_email")
    public MobileElement inputTextEmail;

    @AndroidFindBy(accessibility = "signup_password")
    public MobileElement inputTextPassword;

    @AndroidFindBy(accessibility = "signup_confirmpassword")
    public MobileElement inputTextConfirmPassword;

    @AndroidFindBy(accessibility = "signup_criar")
    public MobileElement buttonCriar;


    public PageCreateAnCount setInputNome(String nome){
        sendText(inputTextNome, nome);
        return this;
    }

    public PageCreateAnCount setInputUserName(String user){
        sendText(inputTextUserName, user);
        return this;
    }

    public PageCreateAnCount setInputTextEmail(String email){
        sendText(inputTextEmail, email);
        return this;
    }

    public PageCreateAnCount setInputSenha(String senha){
        sendText(inputTextPassword, senha);
        return this;
    }

    public PageCreateAnCount setInputConfirmSenha(String senha){
        sendText(inputTextConfirmPassword, senha);
        return this;
    }

    public PageCreateAnCount clickOnBtnCriar(){
        waitAndClickOnButton(buttonCriar);
        return this;
    }
}
