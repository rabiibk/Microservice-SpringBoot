package tn.rabiibk.microservicearticle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.rabiibk.microservicearticle.entities.Article;

public interface ArticleRepository extends JpaRepository<Article,Long> {




}
