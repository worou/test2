package com.formation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formation.entities.Article;

@Repository("arepo")
public interface IArticleRepository extends JpaRepository<Article, Integer>{

	
}
