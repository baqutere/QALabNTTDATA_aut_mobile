@MyDemoApp
Feature: Validación del carrito de compras en My Demo App

  Como usuario de la aplicación de My Demo App
  Quiero agregar productos al carrito
  Para validar que la funcionalidad del carrito se actualiza correctamente

  @carrito
  Scenario Outline: Validación del carrito de compras con productos
    Given estoy en la aplicación de MyDemoApp
    And valido que carguen correctamente los productos en la galeria
    When agrego <UNIDADES> el siguiente "<PRODUCTO>"
    Then valido el carrito de compra actualice correctamente

    Examples:
      | PRODUCTO                  | UNIDADES |
      | Sauce Labs Backpack       | 1        |
      | Sauce Labs Bolt - T.Shirt | 1        |
      | Sauce Labs Bike Light     | 2        |