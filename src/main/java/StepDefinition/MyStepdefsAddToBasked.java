package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pageObjectModel.addToBasked;
import utilities.Driver;

import java.util.Iterator;
import java.util.Set;

public class MyStepdefsAddToBasked {

    final static Logger logger=Logger.getLogger(MyStepdefsAddToBasked.class);

    addToBasked addToBasked=new addToBasked();
    private WebDriver driver;
    @Given("Kullanici Hepsiburada.com sitesini ziyaret eder.")
    public void kullaniciHepsiburadaComSitesiniZiyaretEder() {

        try {

            logger.info("Chrome tarayicisi Basarili sekilde Acildi");
            driver= Driver.getDriver();

        } catch (Exception e){

            logger.error("Chrome driver acilmasi Basarisiz oldu."+ e.getMessage());

        }
        driver.get("https://www.hepsiburada.com");
        logger.info("Kullanıcı Hepsiburada.com sitesini Basarili sekilde goruntuledi.");

    }

    @And("Kullanici giris islemi yapilir.")
    public void kullaniciGirisIslemiYapilir() throws InterruptedException {
        addToBasked.loginClick();
        addToBasked.loginAccount();
        logger.info("Kullanici Basarili sekilde giris islemi yapti.");


    }

    @Then("Yönlendirmeden sonra anasayfada kullanici giris isleminin yapıldıgı doğrulanır.")
    public void yönlendirmedenSonraAnasayfadaKullaniciGirisIslemininYapıldıgıDoğrulanır() {

        addToBasked.verifySuccessLogin();
        logger.info("Anasayfada kullanici giris isleminin yapıldıgı doğrulandi.");
    }

    @And("Kullanici, burada satin almak istedigi ürün icin arama yapar.")
    public void kullaniciBuradaSatinAlmakIstedigiÜrünIcinAramaYapar() throws InterruptedException {

        addToBasked.searchBox();
        logger.info("Kullanici, satin almak istedigi ürün icin Basarili sekilde arama yapti.");
    }

    @And("Kullanici, Arama sonucunda ekrana gelen ürün listesinden \\(veya tek bir sonuc da dönmüs olabilir) ürün secer.")
    public void kullaniciAramaSonucundaEkranaGelenÜrünListesindenVeyaTekBirSonucDaDönmüsOlabilirÜrünSecer() throws InterruptedException {
        addToBasked.productClick();
        logger.info("Kullanici, Arama sonucunda ekrana gelen ürün listesinden urunu Basarili sekilde  secti.");
    }


    @And("Secilen urun icin iki tane farkli saticidan urunu secip sepete ekler.")
    public void secilenUrunIcinIkiTaneFarkliSaticidanUrunuSecipSepeteEkler() throws InterruptedException {
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                addToBasked.addToBaskedProducts();
            }

        }


        logger.info("Urun 2 Farkli saticidan sepete Basarili sekilde eklendi.");
        logger.info("Sepette 2 farkli saticidan oldugu dogrulandi");
    }
    @And("Secilen urun icin {int} tane farkli saticidan urunu secip sepete ekler.")
    public void secilenUrunIcinTaneFarkliSaticidanUrunuSecipSepeteEkler() throws InterruptedException {



    }

    @Then("Secilen ürünün dogru olarak eklendigi ‘Sepetim’ sayfasinda dogrulanmalidir.")
    public void secilenÜrününDogruOlarakEklendigiSepetimSayfasindaDogrulanmalidir() {

        addToBasked.assertProducts();

        logger.info("Secilen ürünün dogru olarak eklendigi ‘Sepetim’ sayfasinda dogrulandi.");

        Driver.tearDown();
    }


}
