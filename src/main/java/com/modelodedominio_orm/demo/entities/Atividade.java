package com.modelodedominio_orm.demo.entities;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "tb_atividade")

public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String descricao;
    private double preco;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @OneToOne(mappedBy = "atividade", cascade = CascadeType.ALL)
    private Bloco blocos;

    @OneToMany(mappedBy = "atividades")
    private List<Participante> participantes = new ArrayList<>();

    public Atividade(){

    }

    public List<Participante> getParticipantes() {

        return participantes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Bloco getBlocos() {
        return blocos;
    }

    public void setBlocos(Bloco blocos) {
        this.blocos = blocos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Atividade atividade = (Atividade) o;
        return Objects.equals(id, atividade.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
