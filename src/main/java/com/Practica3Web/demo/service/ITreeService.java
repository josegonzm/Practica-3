package com.Practica3Web.demo.service;

import java.util.List;
import com.Practica3Web.demo.entities.Tree;

public interface ITreeService {
    List<Tree> getAllProducts();

    void save(Tree tree);

    void delete(Tree tree);
}
