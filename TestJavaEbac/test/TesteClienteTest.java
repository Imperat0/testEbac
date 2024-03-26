import org.junit.Assert;
import org.junit.Test;


public class TesteClienteTest {

	@Test
	public void testeClasseCliente() {
		TesteCliente cli = new TesteCliente();
		cli.adicionarNome("Daniel");
		cli.adicionarNome1("Daniel");

		Assert.assertEquals("Daniel", cli.getNome());
	}
}
