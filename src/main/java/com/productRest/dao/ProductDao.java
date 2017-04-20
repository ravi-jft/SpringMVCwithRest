package com.productRest.dao;

import com.productRest.domain.Product;

import java.util.List;

public interface ProductDao {
    /*public Product addCountry(Product product);*/
     public void addCountry(Product product);
     public List getAllProducts();
}
