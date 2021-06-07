package ajax;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pe.edu.upeu.ajax.dao.ProductoDao;
import pe.edu.upeu.ajax.daoImpl.ProductoDaoImpl;
import pe.edu.upeu.ajax.entity.Producto;

public class ProductoTest {
private ProductoDao pdao;
@Before
public void before() {
	pdao = new ProductoDaoImpl();
}
	@Test
	public void test() {
		int resultado = pdao.create(new Producto("Aceite", 7.5, 20));
		int esperado = 1;
		assertEquals(esperado, resultado);
	}

}
