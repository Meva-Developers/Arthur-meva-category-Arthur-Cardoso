
package com.meva.finance.api;

import com.meva.finance.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("/category")
public class Controller {

    private final CategoryService categoryService;

    @Autowired
    public Controller(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @GetMapping("/users/getIdCategoryByDesc/{description}")
    public ResponseEntity<Long> getIdCategoryByDesc(@PathVariable String description) {
        Long id = categoryService.getIdCategoryByDesc(description);

        if (id == -1L) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(id);
        } else {
            return ResponseEntity.ok().body(id);
        }

    }
}
