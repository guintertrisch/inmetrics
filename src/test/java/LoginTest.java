import locators.Login;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    @Test
    public void deveRealizarLoginComSucesso() {
        Login login = new Login(driver);
        login.inserirNomeUsuario(USUARIO_PADRAO);
        login.inserirSenha("teste123");
        login.clicarEmEntre();
        assertTrue(login.retornaLabelFuncionarios().equals("FUNCIONÁRIOS"));
    }
}
