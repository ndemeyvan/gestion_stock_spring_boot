package com.ndemeyvan.gestiondestock.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ndemeyvan.gestiondestock.model.LigneVente;
import com.ndemeyvan.gestiondestock.model.MvtStk;
import com.ndemeyvan.gestiondestock.model.TypeMvnt;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MvtStkDto {

    private Integer id;

    @JsonIgnore
    private ArticleDto articleDto;

    private Instant dateMvnt;

    private BigDecimal quantite;

    private TypeMvnt typemvnt;

    /**
     * Cette methode permet de faire un mapping de MvtStk vers MvtStkDto
     *
     * @param mvtStk
     * @return
     */
    public static MvtStkDto fromEntity(MvtStk mvtStk) {
        if (mvtStk == null) {
            return null;
        }
        return MvtStkDto.builder()
                .id(mvtStk.getId())
                .quantite(mvtStk.getQuantite())
                .dateMvnt(mvtStk.getDateMvnt())
                .typemvnt(mvtStk.getTypemvnt())
                .build();
    }

    /**
     * Cette methode permet de faire un mapping de mvtStkDto vers MvtStk
     *
     * @param mvtStkDto
     * @return
     */
    public static MvtStk toEntity(MvtStkDto mvtStkDto) {
        if (mvtStkDto == null) {
            return null;
        }
        MvtStk mvtStk = new MvtStk();
        mvtStk.setId(mvtStkDto.getId());
        mvtStk.setQuantite(mvtStkDto.getQuantite());
        mvtStk.setDateMvnt(mvtStkDto.getDateMvnt());
        mvtStk.setTypemvnt(mvtStkDto.getTypemvnt());
        return mvtStk;
    }

}
