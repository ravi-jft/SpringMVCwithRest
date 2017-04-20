package com.productRest.service;

import com.productRest.domain.Product;
import com.productRest.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Override
    public void addProduct(Product product) {
        productDao.addCountry(product);
    }

    public List getAllProducts() {
        return productDao.getAllProducts();
    }

}