package com.productRest.dao;

import com.productRest.domain.Product;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

 @Transactional
 public void addCountry(Product product) {
     hibernateTemplate.save(product);
 }

    public List getAllProducts() {
        List<Product> productList = (List<Product>) hibernateTemplate.findByCriteria(DetachedCriteria.forClass(Product.class));

        return productList;
    }

}
