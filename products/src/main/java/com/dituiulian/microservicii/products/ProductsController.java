package com.dituiulian.microservicii.products;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsController {

    private static final List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Laptop", "Laptop modern si performant", 3000));
        products.add(new Product(2, "Smartphone", "cel mai cautat telefon", 2500));
        products.add(new Product(3, "Monitor", "Monitor UHD", 4000));

    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return products;
    }

    @PostMapping("/products")
    public String addProduct(Product newProduct){
        products.add(newProduct);
        return "produsul a fost adaugat.";
    }

    @PutMapping("/products")
    public String updateProduct(Product updatedProduct){
        for(Product productIterator : products){
             if(productIterator.getId() == updatedProduct.getId()){
                 productIterator.setName(updatedProduct.getName());
                 productIterator.setDescription(updatedProduct.getDescription());
                 productIterator.setPrice(updatedProduct.getPrice());

                 return "Produsul a fost modificat cu succes.";

             }
        }

        return "Produsul nu a fost gasit.";

    }

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable("id") int id){
        for(Product productIterator : products){
            if(productIterator.getId() == id){
                products.remove((productIterator));

                return "Produsul a fost sters.";

            }
        }

        return "Produsul nu a fost gasit.";
    }


}
