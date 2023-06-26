package com.Practica3Web.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.Practica3Web.demo.entities.Tree;
import com.Practica3Web.demo.service.ITreeService;

@Controller
public class TreeController {
    private final ITreeService treeService;

    public TreeController(ITreeService treeService) {
        this.treeService = treeService;
    }

    @GetMapping("/tree")
    public String index(Model model) {

        model.addAttribute("tree", new Tree());
        model.addAttribute("tree", this.treeService.getAllProducts());
        return "tree";
    }

    @PostMapping("tree/save")
    public String save(@ModelAttribute("tree") Tree tree) {
        this.treeService.save(tree);
        return "redirect:/tree";
    }

    @PostMapping("tree/delete")
    public ResponseEntity<String> delete(@RequestBody Tree tree) {
        this.treeService.delete(tree);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
