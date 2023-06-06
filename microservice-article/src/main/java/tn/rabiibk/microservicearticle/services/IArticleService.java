package tn.rabiibk.microservicearticle.services;

import entities.ArticleDto;
import tn.rabiibk.microservicearticle.entities.Article;

import java.util.List;
import java.util.Map;

public interface IArticleService {

    Article createArticle (Article article);

     Article updateArticle(Map<Object,Object> fields , Long id);


    Boolean removeArticle (Article article);


    ArticleDto findArticleById(Long articleId);

    List<Article> retrieveAllArticle();







}
