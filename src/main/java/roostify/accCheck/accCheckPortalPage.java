package roostify.accCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class accCheckPortalPage {

    public WebDriver driver;
    String User = "Account.bank2";
    String Password = "bank2";


    public accCheckPortalPage(WebDriver driver) {
        this.driver = driver;
    }


    By searchBox = By.xpath("//*[@id='search']");
    By lblDagBank = By.xpath("(//*[contains(text(),'DagBank')])[1]");
    //By login =By.xpath("//*[@id='LOGIN']");
    By Username =By.xpath("(//*[@id='LOGIN']");
    By password = By.xpath("//*[@id='PASSWORD1']");
    By btnSubmit =By.xpath("//*[@class='btn btn-blue']");



    public WebElement SearchBox(){
        return driver.findElement(searchBox);
    }
    public WebElement LblDagBank(){return driver.findElement(lblDagBank); }
    public WebElement Username(){ return driver.findElement(Username);}
    public WebElement Password(){
        return driver.findElement(password);
    }
    public WebElement BtnSubmit(){
        return driver.findElement(btnSubmit);
    }




    public void sendTxtToSeachBox(){
        String search = "Dagbank";
        SearchBox().sendKeys(search);
    }

    public void clickBankName(){
        LblDagBank().click();
    }

    public void sendUsername(){
        if(Username().isDisplayed())
        {
            Username().sendKeys(User);
        }
    }

    public void sendPassword(){
        if(Password().isDisplayed())
        {
            Password().sendKeys(Password);
        }
    }

    public void clickSubmitButton(){
        if(BtnSubmit().isDisplayed())
        {
            BtnSubmit().click();
        }
    }

    public void loginToDagBank(){
        sendTxtToSeachBox();
        clickBankName();
        clickSubmitButton();
        sendUsername();
        sendPassword();

    }


}

