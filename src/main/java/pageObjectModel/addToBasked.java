package pageObjectModel;


import io.cucumber.java.en_old.Ac;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class addToBasked extends A101Base {
    private WebDriver driver;

    //Driver ve Findby methodu kullanimi icin pagefactory tanimlanir.


    public addToBasked() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }


    // A101Base'deki fonksiyonlarin kullanimi icin Findby methodu ile element bulunur ve elementler void icindeki fonksiyonlarda kullanilir.


    @FindBy(xpath = "//span[@data-test-id=\"account\"]")
    private WebElement loginElement;

    public void loginClick() throws InterruptedException {
        clickFunction(loginElement);
        Thread.sleep(2000);
        WebElement LoginElement;
        LoginElement = driver.findElement(By.id("login"));
        clickFunction(LoginElement);
        Thread.sleep(5000);


    }

    @FindBy(id = "txtUserName")
    private WebElement emailTextBoxElement;
    @FindBy(name = "password")
    private WebElement passwordElement;

    //login isleminde Actions methodu ile hizli giris yapilir.
    public void loginAccount() throws InterruptedException {
        Actions actions=new Actions(driver);
        actions.click(emailTextBoxElement)
                .sendKeys("edakarahankurt@gmail.com")
                .sendKeys(Keys.ENTER)
                .perform();
        Thread.sleep(5000);
        actions.click(passwordElement)
                .sendKeys("Aa789456")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
        Thread.sleep(5000);
    }
    @FindBy(xpath = "//span[@class=\"sf-OldMyAccount-sS_G2sunmDtZl9Tld5PR\"]")
    private WebElement accountElement;
    public void verifySuccessLogin(){
        System.out.println("Kayitli Kullanici ismi : ");
        Assertion(accountElement, "Eda Kurt");
    }


    @FindBy(xpath = "//input[@class=\"desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b\"]")
    private WebElement searchBoxElement;

    public void searchBox() throws InterruptedException {


        Actions actions = new Actions(driver);
        actions.click(searchBoxElement)
                .sendKeys("Livaneli kitaplari")
                .sendKeys(Keys.ENTER)
                .perform();


    }

    @FindBy(xpath = "//*[@id=\"i0\"]/div")
    private WebElement productElement;

    public void productClick() throws InterruptedException {
        clickFunction(productElement);
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//header[@class='title-wrapper']/h1")
    private WebElement productNameElement;
    @FindBy(xpath = "//span[@class=\"seller\"]/span[2]")
    private WebElement companyNameElement;

    @FindBy(xpath = "//button[@id='addToCart']")
    private WebElement addToCartElement;
    @FindBy(xpath = "//a[@class='checkoutui-Modal-iHhyy79iR28NvF33vKJb']")
    private WebElement firstCloseElement;
    @FindBy(xpath = "/html/body/div[2]/main/div[3]/section[1]/div[3]/div/div[4]/div[2]/div[3]/div/div[2]/table/tbody/tr[1]/td[3]/div/form/button")
    private WebElement otherSeller;
    @FindBy(xpath = "//button[text()='Sepete git']")
    private WebElement closeElement;

    @FindBy(xpath = "//*[@id=\"onboarding_item_list\"]/div[3]/div/div/div[1]/span[2]")
    private WebElement seller1;
    @FindBy(xpath = "//*[@id=\"onboarding_item_list\"]/div[4]/div/div/div[1]/span[2]")
    private WebElement seller2;


//Olusturulan stringler bir sonraki void icindeki Assertion methodunda kullanilir.

    String productName;
    String companyName;
    public void addToBaskedProducts() throws InterruptedException {

        productName=productNameElement.getText().trim();
        companyName=companyNameElement.getText().trim();
        System.out.println("Sepete eklenen urunun adi ve  saticisi : "+productName+"/"+companyName);

        Thread.sleep(5000);
        clickFunction(addToCartElement);
        Thread.sleep(7000);
        clickFunction(firstCloseElement);
        Thread.sleep(5000);
        clickFunction(otherSeller);
        Thread.sleep(5000);
        clickFunction(closeElement);
        Thread.sleep(5000);

// 2 farkli urun satici oldugu dogrulanir.

        Assert.assertNotEquals(seller1.getText(), seller2.getText());
        Thread.sleep(5000);


    }
    @FindBy(xpath = "//div[@class='product_name_3Lh3t']/a")
    private WebElement baskedProductName;

    public void assertProducts(){
        baskedProductName.getText().trim();
        System.out.println("Sepetteki urun adi ve saticisi : ");
        Assertion(baskedProductName, productName);
        Assertion(seller2, companyName);



    }


}
