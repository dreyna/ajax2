package ajax;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import pe.edu.upeu.ajax.dao.UsuarioDao;
import pe.edu.upeu.ajax.daoImpl.UsuarioDaoImpl;



public class UsuarioTest {

	private UsuarioDao udao;
	@Before
	public void before() {
		udao = new UsuarioDaoImpl();
	}
	@Test
	public void validar() {
		int resultado = udao.validar("dreyna", "123");
		int esperado = 1;
		assertEquals(esperado, resultado);
	}

}
