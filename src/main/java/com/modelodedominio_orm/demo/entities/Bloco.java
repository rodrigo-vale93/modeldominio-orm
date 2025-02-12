package com.modelodedominio_orm.demo.entities;


import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_bloco")

public class Bloco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant inicio;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant fim;

    @OneToOne
    @MapsId
    private Atividade atividade;

}
