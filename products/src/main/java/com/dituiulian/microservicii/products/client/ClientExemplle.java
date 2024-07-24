package com.dituiulian.microservicii.products.client;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.Collections;

public class ClientExemplle {

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost/products/2";
        HttpHeaders head = new HttpHeaders();
        head.setAccept(Collections.singletonList(MediaType.APPLICATION_XML));
        HttpEntity<String> httpEntity = new HttpEntity<>("some body" , head);

        ResponseEntity<Product> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, Product.class);
//        Product listaProduse = response.getBody();
//        if (listaProduse != null && listaProduse.length > 0) {
//            for (Product productIterator : listaProduse) {
//                System.out.println(productIterator);
//            }
//
//        }

        Product produsReturnat = response.getBody();
        System.out.println(produsReturnat);

    }

}