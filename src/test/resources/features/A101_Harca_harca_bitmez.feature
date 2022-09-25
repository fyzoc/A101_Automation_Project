@shopping_A101
Feature: A101_test
  Scenario Outline: A101_test_buying_sock
    Given A101 Acılıs sayfasına git.
    Then Giyim & Aksesuar butonuna tıklanır.
    And  Kadın ic Giyime tıklanır.
    And  Dizaltı Corap bölümüne girilir.
    And  Renk filitresinden siyah seçilir.
    Then Acılan ürünün siyah olduğu doğrulanır.
    And Sepete ekle butonuna tıklanır.
    And Sepeti Görüntüle butonuna tıklanır.
    And Sepeti Onayla butonuna tıklanır.
    And Uye olmadan devam et butonuna tıklanır.
    And Mail ekranı gelir ve mail girilir.
    And Devam et butonuna tıklanır.
    And Adres olustura tıklanır
    And Adres bilgileri girilir.Ad,soyad,telefon_numarası,il,ilce,mahalle.Adres kutusuna "<ev_adres>" girilir.
    And Kaydet butonuna tıklanır.
    And Sonra ödeme ekranı gelir.lütfen teslimat adresi secin yazısının cıktıgı dogrulanır.
    Then Siparisi tamamla butonuna tıklayarak,
    Then Odeme ekranına gidildigi ,dogru ekrana yonlendiklerini kontrol edilir
    When Sayfa kapatılır

    Examples:
      |ev_adres|
      |cavusoglu mah. ayvalı sok no:18 İstanbul/KARTAL|

