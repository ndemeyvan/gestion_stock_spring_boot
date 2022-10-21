package com.ndemeyvan.gestiondestock.dto;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LigneCommandeFournisseurDto {

    private Integer id;
    
    private CommandeFournisseurDto commandeFournisseurDto;

    private ArticleDto article;

}
