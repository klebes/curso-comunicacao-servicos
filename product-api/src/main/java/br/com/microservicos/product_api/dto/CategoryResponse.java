package br.com.microservicos.product_api.dto;

import br.com.microservicos.product_api.model.Category;
import org.springframework.beans.BeanUtils;

public class CategoryResponse {

    private Integer id;
    private String description;

    public static CategoryResponse of(Category category){
        var response = new CategoryResponse();
        BeanUtils.copyProperties(category,response);

        return response;
    }
}
