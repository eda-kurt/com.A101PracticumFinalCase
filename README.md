# com.A101PracticumFinalCase

# Hepsiburada.com Cucumber Framework'ü ile Web Test Otomasyonu 
 


## The programming language
    Java

## Build tool
    Maven

## Compiler
    Ide
 

# AllSteps Hepsiburada Web Scenario

### Tags : Chrome

 ### Scenario 1 : Kullanıcı girişi yapılmadan belirtilen ürünü sepete ekleme

     * Kullanıcı Hepsiburada.com sitesini ziyaret eder.
     * Kullanıcı, burada satın almak istediği ürün için arama yapacaktır.
     * Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
     * Ayni urun diger saticidan da secilerek sepete eklenir.
     * Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanmalıdır.
   
  
   
 ### Scenario 2 : Kullanıcı girişi yapılarak sepete ürün eklenmesi

     * Kullanıcı Hepsiburada.com sitesini ziyaret eder.
     * Kullanıcı giriş işlemi yapılır.
     * Yönlendirmeden sonra anasayfada kullanıcı giriş işleminin yapıldığı doğrulanır
     * Kullanıcı, burada satın almak istediği ürün için arama yapacaktır.
     * Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.
     * Ayni urun diger saticidan da secilerek sepete eklenir.
     * Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanmalıdır.
    
  ----
  
  ### Features :
  
     * Yazılacak senaryo için Selenium ve Testng kullanıldi.
     * Assertions kullanarak senaryonun doğru çalışırlığı kontrol edildi.
     * Log kullanıldi.
     * Page object model uygulandi.
     * OOP prensiplerine uygun geliştirildi.
     
  ----
  
  
  <?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>com.A101PracticumFinalCase</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.6.1</version>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.5.0</version>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>7.8.1</version>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-testng</artifactId>
            <version>7.8.1</version>
        </dependency>
        <dependency>
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <version>1.2.17</version>
        </dependency>
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.3.0</version>
        </dependency>
    </dependencies>

</project>

  
  
