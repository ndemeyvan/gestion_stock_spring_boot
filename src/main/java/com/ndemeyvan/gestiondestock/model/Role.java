package com.ndemeyvan.gestiondestock.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "role")
public class Role extends AbstractEntity{


    @ManyToOne
    @JoinColumn(name = "idEntreprise")
    private Utilisateur utilisateur;

    @Column(name = "rolename")
    private String roleName;

}
