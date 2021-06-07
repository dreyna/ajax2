package pe.edu.upeu.ajax.dao;

import java.util.List;

import pe.edu.upeu.ajax.entity.Producto;


public interface ProductoDao {
	public int create(Producto u);
	public int update(Producto u);
	public Producto read(int id);
	public List<Producto> readAll();
	public int delete(int id);
}
