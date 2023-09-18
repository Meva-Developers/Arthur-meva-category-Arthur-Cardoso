
package com.meva.finance.api;

import com.meva.finance.dtos.CategoryDto;
import com.meva.finance.entities.Category;
import com.meva.finance.repositories.CategoryRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/category")
public class Controller {

    private final CategoryRepository categoryRepository;

    public Controller(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

@GetMapping("/list")
public List<CategoryDto> AllCategory() {
        List<Category> categories = categoryRepository.findAll();

        return  ;
    }

}
