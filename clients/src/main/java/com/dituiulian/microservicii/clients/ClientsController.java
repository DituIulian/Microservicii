package com.dituiulian.microservicii.clients;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientsController {

    @GetMapping("/buna")
    public String salut(){
        return "Salut din proiectul Clients";
    }

}
