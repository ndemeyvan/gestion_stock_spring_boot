package com.ndemeyvan.gestiondestock.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "lignecommandeclient")
public class LigneCommandeClient extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article;
    
    @ManyToOne
    @JoinColumn(name = "idCommandeClient")
    private CommandeClient commandeClient;


}
