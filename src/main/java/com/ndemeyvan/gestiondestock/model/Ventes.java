package com.ndemeyvan.gestiondestock.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "vente")
public class Ventes extends AbstractEntity {

    @Column(name = "code")
    private  String code;

    @Column(name = "datevente")
    private  Instant dateVente;

    @Column(name = "commentaire")
    private  String commentaire;
}
