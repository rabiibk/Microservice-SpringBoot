package tn.rabiibk.microservicearticle.controllers;


import entities.ArticleDto;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.rabiibk.microservicearticle.entities.Article;
import tn.rabiibk.microservicearticle.services.IArticleService;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/article")
public class ArticleController {

    IArticleService ArticleService;



    @PatchMapping("{id}")
     Article updateArticle( @RequestBody  Map<Object,Object> fields , @PathVariable  Long id) {

        return ArticleService.updateArticle(fields,id);
    }

    @GetMapping("/find/{id}")
    public ArticleDto findArticleById(@PathVariable Long id) {

        return ArticleService.findArticleById(id);
    }



}
