Feature: Login SwagLab

  @test
  Scenario: Login SwagLab

    When inicio sesión con el usuario "standard_user" y password "secret_sauce"
    Then valido que debería aparecer el título "PRODUCTS"
    And valido existencia de items