package com.formation.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Article implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4276894403489605318L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String titre;
	private String contenu;
	private String url;
	private String parution;
	public Article() {
		super();
	}
	
	public Article(String titre, String contenu, String url, String parution) {
		this.titre = titre;
		this.contenu = contenu;
		this.url = url;
		this.parution = parution;
	}

	public Article(int id, String titre, String contenu, String url, String parution) {
		this.id = id;
		this.titre = titre;
		this.contenu = contenu;
		this.url = url;
		this.parution = parution;
	}
	public int getId() {
		return id;
	}
	public String getTitre() {
		return titre;
	}
	public String getContenu() {
		return contenu;
	}
	public String getUrl() {
		return url;
	}
	public String getParution() {
		return parution;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setParution(String parution) {
		this.parution = parution;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", titre=" + titre + ", contenu=" + contenu + ", url=" + url + ", parution="
				+ parution + "]";
	}

}
