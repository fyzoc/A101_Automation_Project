package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.A101_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class A101_Stepdefination {

    A101_Page a101_page = new A101_Page();
    Faker faker = new Faker();

    @Given("A101 Acılıs sayfasına git.")
    public void a101_acılıs_sayfasına_git() {
        Driver.getDriver().get(ConfigReader.getProperty("a101_url"));
        a101_page.oppenning_page.click();
    }
    @Then("Giyim & Aksesuar butonuna tıklanır.")
    public void giyim_aksesuar_butonuna_tıklanır() {
        Driver.clickWithJS(a101_page.giyim);
    }
    @Then("Kadın ic Giyime tıklanır.")
    public void kadın_ic_giyime_tıklanır() {
        Driver.clickWithJS(a101_page.icgiyim);
    }
    @Then("Dizaltı Corap bölümüne girilir.")
    public void dizaltı_corap_bölümüne_girilir() {
        Driver.clickWithJS(a101_page.corap);
    }
    @Then("Renk filitresinden siyah seçilir.")
    public void renk_filitresinden_siyah_seçilir() {
        Driver.waitAndClick(a101_page.siyah, 3);
        System.out.println(a101_page.renk.getText());
        boolean isTrue = a101_page.renk.getText().contains("Penti Kadın 50 Denye Pantolon Çorabı Siyah");
        Assert.assertTrue(isTrue);
        Driver.clickWithJS(a101_page.button1);
    }
    @Then("Acılan ürünün siyah olduğu doğrulanır.")
    public void acılan_ürünün_siyah_olduğu_doğrulanır() {
        boolean thisTrue = a101_page.nsiyah.getText().contains("SİYAH");
        Assert.assertTrue(thisTrue);
    }
    @Then("Sepete ekle butonuna tıklanır.")
    public void sepete_ekle_butonuna_tıklanır() {
        Driver.clickWithJS(a101_page.sepeteEkle);
    }
    @Then("Sepeti Görüntüle butonuna tıklanır.")
    public void sepeti_görüntüle_butonuna_tıklanır() {
        Driver.clickWithJS(a101_page.sepet);
    }
    @Then("Sepeti Onayla butonuna tıklanır.")
    public void sepeti_onayla_butonuna_tıklanır() {
        Driver.clickWithJS(a101_page.onayla);
    }
    @Then("Uye olmadan devam et butonuna tıklanır.")
    public void uye_olmadan_devam_et_butonuna_tıklanır() {
        Driver.waitAndClick(a101_page.üyeOlmadan);
    }
    @Then("Mail ekranı gelir ve mail girilir.")
    public void mail_ekranı_gelir_ve_mail_girilir() {
        Driver.waitForVisibility(a101_page.email, 2);

        String mail = faker.internet().emailAddress();
        a101_page.email.sendKeys(mail);
    }
    @Then("Devam et butonuna tıklanır.")
    public void devam_et_butonuna_tıklanır() {
        Driver.clickWithJS(a101_page.devamEt);
    }
    @And("Adres olustura tıklanır")
    public void adresOlusturaTıklanır() throws InterruptedException {
        Driver.clickWithJS(a101_page.yeni_adress);
    }
    @Then("Adres bilgileri girilir.Ad,soyad,telefon_numarası,il,ilce,mahalle.Adres kutusuna {string} girilir.")
    public void adres_bilgileri_girilir_ad_soyad_telefon_numarası_il_ilce_mahalle_adres_kutusuna_girilir(String ev_adres) throws InterruptedException {
        a101_page.adress_baslık.sendKeys("Home");
        a101_page.ad.sendKeys(faker.name().firstName());
        a101_page.soyad.sendKeys(faker.name().lastName());
        a101_page.cep_telefon.sendKeys("05070212464");

        Select select = new Select(a101_page.il);
        Thread.sleep(1000);
        select.selectByIndex(2);

        Select select2 = new Select(a101_page.ilce);
        Thread.sleep(1000);
        select2.selectByIndex(2);

        Select select3 = new Select(a101_page.mahalle);
        Thread.sleep(1000);
        select3.selectByIndex(3);

        a101_page.adress.sendKeys(ev_adres);
    }
    @Then("Kaydet butonuna tıklanır.")
    public void kaydet_butonuna_tıklanır() throws InterruptedException {
        Driver.clickWithJS(a101_page.kaydet);
        Thread.sleep(3000);
    }
    @Then("Sonra ödeme ekranı gelir.lütfen teslimat adresi secin yazısının cıktıgı dogrulanır.")
    public void sonra_ödeme_ekranı_gelir_lütfen_teslimat_adresi_secin_yazısının_cıktıgı_dogrulanır() {
       Assert.assertTrue(a101_page.assert_text.isDisplayed());
    }
    @Then("Siparisi tamamla butonuna tıklayarak,")
    public void siparisi_tamamla_butonuna_tıklayarak() throws InterruptedException {
        Driver.clickWithJS(a101_page.button2);
        Thread.sleep(3000);
    }
    @Then("Odeme ekranına gidildigi ,dogru ekrana yonlendiklerini kontrol edilir")
    public void odemeEkranınaGidildigiDogruEkranaYonlendikleriniKontrolEdilir() {
        Driver.waitForVisibility(a101_page.son_baslık, 3);
        Assert.assertTrue(a101_page.son_baslık.isDisplayed());
    }
    @When("Sayfa kapatılır")
    public void sayfaKapatılır() {
        Driver.closeDriver();
    }
}
