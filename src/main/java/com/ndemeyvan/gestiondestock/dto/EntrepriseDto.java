package com.ndemeyvan.gestiondestock.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EntrepriseDto {
    
    private String nom;

    private List<UtilisateurDto> utilisateur;

}
