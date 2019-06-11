package com.formation.iservice;

import java.util.List;

public interface IGenericService<P,I> {

	public P ajouter(P p);
	public P update(P p);
	public void delete(I id);
	public P findOne(I id);
	public List<P> findAll();
}
