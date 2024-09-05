package com.infnet.spring.jpa.h2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vendas")
public class Vendas {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "idLivro")
  private Long idLivro;

  @Column(name = "valor")
  private String valor;

  @Column(name = "description")
  private String description;

  public Vendas() {

  }

  public Vendas(Long idLivro,String valor, String description) {
    this.idLivro = idLivro;
    this.description = description;
    this.valor = valor;
  }

  public long getId() {
    return id;
  }

  public Long getidLivro() {
    return idLivro;
  }

  public void setidLivro(Long idLivro) {
    this.idLivro = idLivro;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  @Override
  public String toString() {
    return "Vendas [id=" + id + ", idLivro=" + idLivro + ", desc=" + description + ", valor=" + valor + "]";
  }

}
