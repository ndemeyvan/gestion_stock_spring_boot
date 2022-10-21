package com.ndemeyvan.gestiondestock.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.ndemeyvan.gestiondestock.model.TypeMvnt;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MvtStkDto {

    private Integer id;

    private ArticleDto articleDto;

    private Instant dateMvnt;

    private BigDecimal quantite;

    private TypeMvnt typemvnt;
}
