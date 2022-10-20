package com.ndemeyvan.gestiondestock.dto;

import java.util.List;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FournisseurDto {
    
    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String photo;

    private String email;

    private String numeroTelephone;

    private List<CommandeFournisseurDto> commandeFournisseurs;

}
