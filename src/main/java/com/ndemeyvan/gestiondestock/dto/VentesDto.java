package com.ndemeyvan.gestiondestock.dto;

import java.time.Instant;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class VentesDto {
   
    private  String code;

    private  Instant dateVente;

    private  String commentaire;
}
