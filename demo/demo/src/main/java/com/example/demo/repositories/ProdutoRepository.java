package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Domains.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
