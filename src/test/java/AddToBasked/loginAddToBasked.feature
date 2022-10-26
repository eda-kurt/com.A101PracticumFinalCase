Feature: Hepsiburada.com üzerinden sepete ürün eklenmesi

  Scenario:Kullanici girisi yapilarak sepete ürün eklenmesi

  Rule : Kayitli bir kullanici olmalidir.
  Rule : Arama yapilacak urunun en az 2 saticisi olmalidir.

    Given Kullanici Hepsiburada.com sitesini ziyaret eder.
    And Kullanici giris islemi yapilir.
    Then Yönlendirmeden sonra anasayfada kullanici giris isleminin yapıldıgı doğrulanır.
    And Kullanici, burada satin almak istedigi ürün icin arama yapar.
    And Kullanici, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuc da dönmüs olabilir) ürün secer.
    And Secilen urun icin iki tane farkli saticidan urunu secip sepete ekler.
    Then Secilen ürünün dogru olarak eklendigi ‘Sepetim’ sayfasinda dogrulanmalidir.