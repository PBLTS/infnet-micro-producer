package com.infnet.spring.jpa.h2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infnet.spring.jpa.h2.model.Vendas;

public interface VendaRepository extends JpaRepository<Vendas, Long> {

  List<Vendas> findByDescriptionContainingIgnoreCase(String nome);
}
