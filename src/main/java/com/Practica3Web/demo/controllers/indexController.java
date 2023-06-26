package com.Practica3Web.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.Practica3Web.demo.service.ITreeService;

@Controller
public class indexController {
    private final ITreeService treeService;

    public indexController(ITreeService treeService) {
        this.treeService = treeService;
    }

    @GetMapping("/")
    public String index(Model model) {
        var productos = this.treeService.getAllProducts();
        model.addAttribute("products", productos);
        return "index";
    }
}
