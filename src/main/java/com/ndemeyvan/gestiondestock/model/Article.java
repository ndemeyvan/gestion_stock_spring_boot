package com.ndemeyvan.gestiondestock.model;


import lombok.*;
import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "article")
public class Article extends AbstractEntity{

    @Column(name = "articlecode")
    private String codeArticle;

    @Column(name = "designation")
    private String designation;

    @Column(name = "prixunitaireHt")
    private BigDecimal prixUnitaireHt;

    @Column(name = "tauxtva")
    private BigDecimal tauxTva;

    @Column(name = "prixunitairettc")
    private BigDecimal prixUntaireTtc;

    @Column(name = "photo")
    private String photo;

    /*
     * @ManyToOne Plusieur Article pour une category
     * @JoinColumn Le nom par lequel on va joindre la category
     */
    @ManyToOne
    @JoinColumn(name = "idCategory")
    private Category category;


}
