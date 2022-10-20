package com.ndemeyvan.gestiondestock.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "lignevente")
public class LigneVente extends AbstractEntity {


    @ManyToOne
    @JoinColumn(name = "idVente")
    private  Ventes ventes;

    @Column(name = "quantite")
    private BigDecimal quantite;



}
