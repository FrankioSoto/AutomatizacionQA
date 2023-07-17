Feature: feature to test login functionality

  @TestLogin

  Scenario: check login is successful with valid credential
    Given user is on login pages
    When user enter Username "1094970294" and password "ABril2023**..."
    Then user in on polarix page with "Clientes Correo"


  @TestLoginPassword

  Scenario: check login is successful with invalid credential password
    Given user is on login pages
    When user enter Username "1094970294" and password "pruebaerror"
    Then user in on polarix page with "Clientes Correo" //poner el mensaje de la web

  @TestLoginUser

  Scenario: check login is successful with invalid credential user
    Given user is on login pages
    When user enter Username "10949702" and password "ABril2023**.."
    Then user in on polarix page with "Clientes Correo" //poner el mensaje de la web
