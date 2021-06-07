package pe.edu.upeu.ajax.dao;

import java.util.List;

import pe.edu.upeu.ajax.entity.Usuario;



public interface UsuarioDao {
	public int validar(String user, String pass);
	public int create(Usuario u);
	public int update(Usuario u);
	public Usuario read(int id);
	public List<Usuario> readAll();
	public int delete(int id);
}
