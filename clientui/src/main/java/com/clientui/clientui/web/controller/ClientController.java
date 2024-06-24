package com.clientui.clientui.web.controller;

import com.clientui.clientui.beans.ProductBean;
import com.clientui.clientui.proxies.MicroserviceProduitsProxy;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ClientController {
    @Autowired
    private final MicroserviceProduitsProxy produitsProxy;


    public ClientController(MicroserviceProduitsProxy produitsProxy) {
        this.produitsProxy = produitsProxy;
    }
    @RequestMapping("/")
    public String accueil(@NotNull Model model) {
        List<ProductBean> produits = produitsProxy.listeDesProduits();
        model.addAttribute("produits", produits);
        return "Accueil";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, world";
    }
}
