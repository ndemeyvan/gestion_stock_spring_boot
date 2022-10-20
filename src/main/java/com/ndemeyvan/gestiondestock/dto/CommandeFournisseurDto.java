package com.ndemeyvan.gestiondestock.dto;

import java.time.Instant;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CommandeFournisseurDto {
   
    private FournisseurDto fournisseur;

    private String code;

    private Instant dateCommande;

    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurListDtos;

}
