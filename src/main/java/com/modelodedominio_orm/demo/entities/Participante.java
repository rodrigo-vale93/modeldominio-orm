package com.modelodedominio_orm.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_participante")

public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String email;

    @ManyToOne
    @JoinColumn(name = "atividades_id")
    private Atividade atividades;


    public Participante(){

    }

    public Participante(Integer id, String nome, String email, Atividade atividades) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.atividades = atividades;
    }


}
