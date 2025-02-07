package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CatalogSteps;
import com.nttdata.steps.ProductSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class AppStepsDef {

    @Steps
    CatalogSteps catalogSteps;

    @Steps
    ProductSteps productSteps;

    private int unidadesAValidar;

    @Given("estoy en la aplicación de MyDemoApp")
    public void estoy_en_la_aplicacion_de_my_demo_app() {
        catalogSteps.validateTitle();
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void valido_que_carguen_correctamente_los_productos_en_la_galeria() {
        catalogSteps.validateListProducts();
    }

    @When("agrego {int} el siguiente {string}")
    public void agrego_el_iguiente(Integer unidades, String producto) {
        catalogSteps.selectProduct(producto);
        productSteps.validateTitle(producto);
        productSteps.validateQuantity(unidades);

        this.unidadesAValidar = unidades;

        productSteps.clickToCart();
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void valido_el_carrito_de_compra_actualice_correctamente() {
        productSteps.validateQuantityToCart(this.unidadesAValidar);
    }




}
