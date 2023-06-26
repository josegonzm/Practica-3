package com.Practica3Web.demo.service.impl;

import java.util.List;
import com.Practica3Web.demo.db.ITreeRepository;
import com.Practica3Web.demo.entities.Tree;
import com.Practica3Web.demo.service.ITreeService;
import org.springframework.stereotype.Service;

@Service
public class TreeService implements ITreeService {

    private final ITreeRepository treeRepository;

    public TreeService(ITreeRepository treeRepository) {
        this.treeRepository = treeRepository;
    }

    public List<Tree> getAllProducts() {
        return (List<Tree>) this.treeRepository.findAll();
    }

    public void save(Tree tree) {
        this.treeRepository.save(tree);
    }

    public void delete(Tree tree) {
        this.treeRepository.delete(tree);
    }
}
