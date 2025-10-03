package br.com.microservicos.product_api.service;

import br.com.microservicos.product_api.config.exception.ValidationException;
import br.com.microservicos.product_api.dto.CategoryRequest;
import br.com.microservicos.product_api.dto.CategoryResponse;
import br.com.microservicos.product_api.model.Category;
import br.com.microservicos.product_api.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.apache.commons.lang3.ObjectUtils.isEmpty;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryResponse save(CategoryRequest request ){
        validateCategoryNameInformed(request);
        var category = categoryRepository.save(Category.of(request));

        return CategoryResponse.of(category);
    }

    public void validateCategoryNameInformed(CategoryRequest request){
        if(isEmpty(request.getDescription())){
            throw new ValidationException("The category description was not informed.");
        }
    }
}
