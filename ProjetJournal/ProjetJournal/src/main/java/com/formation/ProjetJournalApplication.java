package com.formation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.formation.entities.Article;
import com.formation.service.ArticleService;

@SpringBootApplication
public class ProjetJournalApplication {

	@Autowired
	ArticleService sdao;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetJournalApplication.class, args);
	}
	
//	@Override
//	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Article a = new Article("Sur les épaules de Darwin", "\n" + 
//				"\n" + 
//				"Accedebant enim eius asperitati, ubi inminuta vel laesa amplitudo imperii dicebatur.", "/lorem/ipsum.php", "03/02/15");
//		
//		sdao.ajouter(a);
//		System.out.println(sdao.findOne(3));
//		System.out.println(sdao.findAll());
//	}
		
	
	
 

	
}
