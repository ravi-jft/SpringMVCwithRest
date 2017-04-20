package com.productRest.controller;

import com.productRest.domain.Product;
import com.productRest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ComponentScan("com.productRest")

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    //rest create

    @RequestMapping(value = "/addCountry", method = RequestMethod.POST, headers = "Accept=application/json")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @RequestMapping(value = "/getAllProducts", method = RequestMethod.GET, headers = "Accept=application/json")
    public List getProducts() {

        List listOfCountries = productService.getAllProducts();
        return listOfCountries;
    }

   /* @RequestMapping(value = "/")
    public String index()   {
        return "index";
    }*/

    /*@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST,headers = "Accept=application/json")
    public String saveOrUpdate(@ModelAttribute("product") Product product){
        productService.addProduct(product);
        return "redirect:/getAllProducts";
    }*/

 /*   @RequestMapping(value = "/getAllProducts", headers = "Accept=application/json")
    public String getProducts(Model model){
        List listOfProducts = productService.getAllProducts();
        model.addAttribute("product",new Product());
        model.addAttribute("listOfProducts",listOfProducts);
        return "productDetails";
    }*/
}
