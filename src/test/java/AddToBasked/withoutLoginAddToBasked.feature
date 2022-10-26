Feature: Hepsiburada.com üzerinden sepete ürün eklenmesi

  Scenario: Kullanıcı girişi yapılmadan belirtilen ürünü sepete ekleme

  Rule : Arama yapilacak urunun en az 2 saticisi olmalidir.

    Given Kullanici Hepsiburada.com sitesini ziyaret eder.
    And Kullanici, burada satin almak istedigi ürün icin arama yapar.
    And Kullanici, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuc da dönmüs olabilir) ürün secer.
    And Secilen urun icin iki tane farkli saticidan urunu secip sepete ekler.
    And Secilen ürünün dogru olarak eklendigi ‘Sepetim’ sayfasinda dogrulanmalidir.