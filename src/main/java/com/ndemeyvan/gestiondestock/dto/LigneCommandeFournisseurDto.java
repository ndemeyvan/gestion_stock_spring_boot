package com.ndemeyvan.gestiondestock.dto;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LigneCommandeFournisseurDto {
    
    private CommandeFournisseurDto commandeFournisseurDto;

    private ArticleDto article;

}
