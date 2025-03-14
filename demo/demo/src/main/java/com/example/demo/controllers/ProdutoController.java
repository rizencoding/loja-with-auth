package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.DemoApplication;
import com.example.demo.Domains.Produto;
import com.example.demo.repositories.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final DemoApplication demoApplication;
    
    @Autowired
    ProdutoRepository produtoRepository;


    ProdutoController(DemoApplication demoApplication) {
        this.demoApplication = demoApplication;
    }


    @PostMapping
    public void cadastrar(@RequestBody Produto produto){
        Produto p1 = new Produto(produto.getNome(),produto.getPreco(),produto.getQuantidade());
        System.out.println(p1.getNome());
        System.out.println(p1.getPreco());
        System.out.println(p1.getQuantidade());
        produtoRepository.save(p1);
    }

    @GetMapping
    public List<Produto> listar(){
        return produtoRepository.findAll();
    }
}
