package com.ndemeyvan.gestiondestock.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ndemeyvan.gestiondestock.model.Category;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CategoryDto {

    private Integer id;

    private String code;

    private String designation;

    @JsonIgnore
    private List<ArticleDto> articleDtos;

    /**
     * Cette methode permet de faire un mapping de category vers categoryDto
     *
     * @param category
     * @return
     */
    public static CategoryDto fromEntity(Category category) {
        if (category == null) {
            return null;
            // Throw Exeption
        }
        return CategoryDto.builder()
                .id(category.getId())
                .code(category.getCode())
                .designation(category.getDesignation())
                .build();
    }

    /**
     * Cette methode permet de faire un mapping de categoryDto vers category
     *
     * @param categoryDto
     * @return
     */
    public static Category toEntity(CategoryDto categoryDto) {
        if (categoryDto == null) {
            return null;
            // Throw Exeption
        }
        Category category = new Category();
        category.setId(category.getId());
        category.setCode(categoryDto.getCode());
        category.setDesignation(categoryDto.getDesignation());
        return category;
    }

}
