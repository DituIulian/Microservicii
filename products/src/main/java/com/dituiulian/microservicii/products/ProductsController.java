package com.dituiulian.microservicii.products;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Salutare tuturor!";
    }

}
