package com.ndemeyvan.gestiondestock.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LigneVenteDto {
    
    private  VentesDto ventesDto;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
}
