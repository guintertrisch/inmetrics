import locators.Login;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest{
    @Test
    public void devereRealizarLoginComSucesso() {

        Login login = new Login(driver);

        login.inserirNomeUsuario("operacao763");
        login.inserirSenha("teste123");
        login.clicarEmEntre();
        assertTrue(login.retornaLabelFuncionarios().equals("FUNCIONÁRIOS"));
    }
}
