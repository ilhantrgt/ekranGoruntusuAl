Feature: Ekran Görüntüsü AL

  @login
  Scenario: Login olup PPM den SPI ekran görüntüsü alınır.
    When Ana Sayfayı Aç
    And Login Ol ve SPI Sayfasına Tıkla
    Then Ekran Görüntüsü Al
