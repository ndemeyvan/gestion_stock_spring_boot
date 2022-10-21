package com.ndemeyvan.gestiondestock.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ndemeyvan.gestiondestock.model.Adresse;
import com.ndemeyvan.gestiondestock.model.Article;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ArticleDto {

    private Integer id;

    private String codeArticle;

    private String designation;

    private BigDecimal prixUnitaireHt;

    private BigDecimal tauxTva;
    private BigDecimal prixUntaireTtc;

    private String photo;

    @JsonIgnore
    private CategoryDto categoryDto;


    /**
     * Cette methode permet de faire un mapping de Article vers ArticleDto
     *
     * @param article
     * @return
     */
    public static ArticleDto fromEntity(Article article) {
        if (article == null) {
            return null;
        }
        return ArticleDto.builder()
                .codeArticle(article.getCodeArticle())
                .designation(article.getDesignation())
                .prixUnitaireHt(article.getPrixUnitaireHt())
                .prixUntaireTtc(article.getPrixUntaireTtc())
                .id(article.getId())
                .build();
    }

    /**
     * Cette methode permet de faire un mapping de articleDto vers article
     *
     * @param articleDto
     * @return
     */
    public static Article toEntity(ArticleDto articleDto) {
        if (articleDto == null) {
            return null;
        }
        Article article = new Article();
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setDesignation(articleDto.getDesignation());
        article.setId(articleDto.getId());
        article.setPrixUnitaireHt(articleDto.getPrixUnitaireHt());
        article.setPrixUntaireTtc(articleDto.prixUntaireTtc);
        return article;
    }

}
