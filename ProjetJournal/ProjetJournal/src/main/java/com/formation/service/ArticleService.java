package com.formation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.formation.entities.Article;
import com.formation.iservice.IArticleService;
import com.formation.repo.IArticleRepository;

@Service
public class ArticleService implements IArticleService{

	@Autowired
	@Qualifier("arepo")
	private  IArticleRepository repo;
	
	@Override
	public Article ajouter(Article p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public Article update(Article p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Article findOne(Integer id) {
		// TODO Auto-generated method stub
		return repo.getOne(id);
	}

	@Override
	public List<Article> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
