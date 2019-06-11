package com.formation.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.formation.entities.Article;
import com.formation.repo.IArticleRepository;

@RestController
@RequestMapping("/apiArticle")
public class ArticleRestController{

	@Autowired
	private  IArticleRepository repo;
	
	@RequestMapping(value = "/ajouter", method = RequestMethod.POST)
	public Article ajouter(@RequestBody Article p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@RequestMapping(value="/update", method = RequestMethod.PUT)
	public Article update(@RequestBody Article p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@RequestMapping(value = "/findone/{id}", method = RequestMethod.GET)
	public Article findOne(@PathVariable("id") Integer id) {
		// TODO Auto-generated method stub
		return repo.getOne(id);
	}

	@RequestMapping(value = "/findall", method = RequestMethod.GET)
	public List<Article> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	
}
