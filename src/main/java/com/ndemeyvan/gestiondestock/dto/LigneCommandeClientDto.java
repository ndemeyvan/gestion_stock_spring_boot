package com.ndemeyvan.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LigneCommandeClientDto {
    
    private ArticleDto article;
    
    private CommandeClientDto commandeClientDto;

}
