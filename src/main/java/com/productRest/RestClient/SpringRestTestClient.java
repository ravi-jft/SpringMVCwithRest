package com.productRest.RestClient;

import com.productRest.domain.Product;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;

public class SpringRestTestClient {
    public static final String REST_SERVICE_URI = "localhost:8080/productRest";

    /* GET */
    @SuppressWarnings("unchecked")
    private static void listAllUsers(){

        RestTemplate restTemplate = new RestTemplate();
        List<LinkedHashMap<String, Object>> usersMap = restTemplate.getForObject(REST_SERVICE_URI+"/product/", List.class);

        if(usersMap!=null){
            for(LinkedHashMap<String, Object> map : usersMap){
                System.out.println("User : id="+map.get("id")+", Name="+map.get("name"));
            }
        }else{
            System.out.println("No user exist----------");
        }
    }


    /* POST */
    private static void createProduct() {
        System.out.println("Testing create User API----------");
        RestTemplate restTemplate = new RestTemplate();
        Product product = new Product(0,"Sarah",);
        URI uri = restTemplate.postForLocation(REST_SERVICE_URI+"/user/", product, Product.class);
        System.out.println("Location : "+uri.toASCIIString());
    }


    public static void main(String args[]){
        createProduct()
    }
}
