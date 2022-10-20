package com.ndemeyvan.gestiondestock.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CategoryDto {
 
    private String code;

    private String designation;

    private List<ArticleDto> articleDtos;
    
}
