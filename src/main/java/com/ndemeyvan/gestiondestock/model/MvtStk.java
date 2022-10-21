package com.ndemeyvan.gestiondestock.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "mouvementstock")
public class MvtStk  extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article;

    @Column(name = "datemouvement")
    private Instant dateMvnt;


    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "typemvnt")
    private TypeMvnt typemvnt;




}
