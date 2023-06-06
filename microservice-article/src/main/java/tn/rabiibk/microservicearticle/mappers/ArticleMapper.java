package tn.rabiibk.microservicearticle.mappers;

import entities.ArticleDto;
import entities.StockDto;
import tn.rabiibk.microservicearticle.entities.Article;

public class ArticleMapper {

    public static ArticleDto mapToDto(Article article, StockDto stockDto) {


        ArticleDto articleDto = ArticleDto.builder()
                .id(article.getId())
                .createdAt(article.getCreatedAt())
                .updatedAt(article.getUpdatedAt())
                .name(article.getName())
                .quantity(article.getQuantity())
                .StockDto(stockDto)
                .build();

        return articleDto;
    }


    public static Article mapToEntity(ArticleDto articleDto) {

        Article article = Article.builder()
                .quantity(articleDto.getQuantity())
                .name(articleDto.getName())
                .build();

        return article;

    }
}
