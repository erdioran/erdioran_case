Feature: Hepsiburada - Android

  @ANDROID @PRODUCT_DETAIL
  Scenario: PRODUCT_DETAIL - Image Zoom Action
    * open app
    * wait until see the "HOME_TUM_KATEGORILER_BUTTON" element
    * click "HOME_TUM_KATEGORILER_BUTTON"
    * click "CATEGORIES_TOP_MENU_TELEFON_TABLET"
    * click "SUB_CATEGORIES_CEP_TELEFONLARI"
    * click "SUB_CATEGORIES_DETAIL_TUM_URUNLER"
    * click "CATEGORY_LİST_ITEM_1"
    * click "PRODUCT_DETAIL_IMAGE"
    * i see "PRODUCT_DETAIL_IMAGE_ZOOM" element
    * i see "PRODUCT_DETAIL_IMAGE_CLOSE_BUTTON" element
    * i cant see "PRODUCT_DETAIL_SEPETE_EKLE_BUTTON" element
    * click "PRODUCT_DETAIL_IMAGE_CLOSE_BUTTON"
    * i cant see "PRODUCT_DETAIL_IMAGE_ZOOM" element
    * i see "PRODUCT_DETAIL_SEPETE_EKLE_BUTTON" element

  @ANDROID @PRODUCT_DETAIL
  Scenario: PRODUCT_DETAIL - The application has been sent to the background and when called from the background it appears to be a product detail page
    * open app
    * wait until see the "HOME_TUM_KATEGORILER_BUTTON" element
    * click "HOME_TUM_KATEGORILER_BUTTON"
    * click "CATEGORIES_TOP_MENU_TELEFON_TABLET"
    * click "SUB_CATEGORIES_CEP_TELEFONLARI"
    * click "SUB_CATEGORIES_DETAIL_TUM_URUNLER"
    * click "CATEGORY_LİST_ITEM_1"
    * i see "PRODUCT_DETAIL_SEPETE_EKLE_BUTTON" element
    * app goes to background
    * i cant see "PRODUCT_DETAIL_SEPETE_EKLE_BUTTON" element
    * app goes to foreground
    * i see "PRODUCT_DETAIL_SEPETE_EKLE_BUTTON" element


  @ANDROID @PRODUCT_DETAIL
  Scenario: PRODUCT_DETAIL - Swipe Action and Üye Olmadan Kesfet Function
    * open app
    * wait until see the "HOME_TUM_KATEGORILER_BUTTON" element
    * click "HOME_TUM_KATEGORILER_BUTTON"
    * click "CATEGORIES_TOP_MENU_TELEFON_TABLET"
    * click "SUB_CATEGORIES_CEP_TELEFONLARI"
    * click "SUB_CATEGORIES_DETAIL_TUM_URUNLER"
    * click "CATEGORY_LİST_ITEM_1"
    * i see "PRODUCT_DETAIL_SEPETE_EKLE_BUTTON" element
    * click "PRODUCT_DETAIL_KARSILASTIRMA_BUTTON"
    * i see "PRODUCT_DETAIL_KARSILASTIRMA_POPUP_KARSILASTIR_BUTTON" element