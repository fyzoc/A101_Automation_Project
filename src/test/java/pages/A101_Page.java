package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class A101_Page {

    public A101_Page() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    public WebElement oppenning_page;

    @FindBy (xpath = "(//a[@title='GİYİM & AKSESUAR'])[1]")
    public WebElement giyim;

    @FindBy (xpath = "(//a[@href='/giyim-aksesuar/kadin-ic-giyim/'])[2]")
    public WebElement icgiyim;

    @FindBy (xpath = "//a[@title='Dizaltı Çorap']")
    public WebElement corap;

    @FindBy (xpath = "(//label[@for='attributes_integration_colourSİYAH']")
    public WebElement siyah;

    @FindBy (xpath = "(//h3[@class='name'])[1]")
    public WebElement renk;

    @FindBy (xpath = "(//span[@class='hidden-mobile'])[1]")
    public WebElement button1;

    @FindBy (xpath = "//span[text()='SİYAH']")
    public WebElement nsiyah;

    @FindBy (xpath = "//button[@class='add-to-basket button green block with-icon js-add-basket']")
    public WebElement sepeteEkle;

    @FindBy (partialLinkText= "Sepeti Görüntüle")
    public WebElement sepet;

    @FindBy (partialLinkText = "Sepeti Onayla")
    public WebElement onayla ;

    @FindBy (partialLinkText = "ÜYE OLMADAN DEVAM ET")
    public WebElement üyeOlmadan;

    @FindBy (xpath = "(//input[@type='text'])[11]")
    public WebElement email;

    @FindBy (xpath = "(//button[@type='submit'])[4]")
    public WebElement devamEt;

    @FindBy (xpath = "(//a[@class='new-address js-new-address'])[1]")
    public WebElement yeni_adress;

    @FindBy (xpath = "//span[@class='title']")
    public WebElement assertitle;

    @FindBy (name = "title")
    public WebElement adress_baslık;

    @FindBy (name = "first_name")
    public WebElement ad;

    @FindBy (name = "last_name")
    public WebElement soyad;

    @FindBy (name = "phone_number")
    public WebElement cep_telefon;

    @FindBy (name = "city")
    public WebElement il;

    @FindBy (name = "township")
    public WebElement ilce;

    @FindBy (name = "district")
    public WebElement mahalle;

    @FindBy (name = "line")
    public WebElement adress;

    @FindBy (xpath = "(//button[@type='button'])[6]")
    public WebElement kaydet;

    @FindBy (xpath = "(//button[@type='submit'])[1]")
    public WebElement button2;

    @FindBy (xpath = "(//div[@class='title'])[9]")
    public WebElement son_baslık;

}