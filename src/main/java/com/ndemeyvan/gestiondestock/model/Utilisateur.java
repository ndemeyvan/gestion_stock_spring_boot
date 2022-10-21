package com.ndemeyvan.gestiondestock.model;

import lombok.*;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true) //Appele la fonction super sur le contructeur
@Table(name = "utilisateur")
public class Utilisateur  extends AbstractEntity{

    @Column(name = "nom")
    private  String nom;

    @Column(name = "prenom")
    private  String prenom;

    @Column(name = "email")
    private String email;

    @Column(name = "datedenaissance")
    private String dateDeNaissance;

    @Column(name = "motdepasse")
    private String motDePasse;

    @Embedded
    private Adresse adresse;

    @Column(name = "photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name = "idEntreprise")
    private Entreprise entreprise;

    @OneToMany(mappedBy = "utilisateur")
    private List<Role> Role;

}
