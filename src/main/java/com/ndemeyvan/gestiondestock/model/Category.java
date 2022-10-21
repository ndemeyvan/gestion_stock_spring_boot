package com.ndemeyvan.gestiondestock.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "category")
public class Category extends AbstractEntity {

    @Column(name = "codecategory")
    private String code;

    @Column(name = "designation")
    private String designation;

    /**
     * Une < Category> Pour plusieur <Article/>
     */
    @OneToMany(mappedBy = "category")
    private List<Article> article;
}
