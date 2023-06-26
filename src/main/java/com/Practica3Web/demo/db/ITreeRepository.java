package com.Practica3Web.demo.db;

import com.Practica3Web.demo.entities.Tree;
import org.springframework.data.repository.CrudRepository;

public interface ITreeRepository extends CrudRepository<Tree, Integer>{
    
}
