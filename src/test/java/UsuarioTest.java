import locators.Usuario;
import org.testng.annotations.Test;

public class UsuarioTest extends BaseTest {
    @Test
    public void deveCadatrarUsuarioComSucesso() {
        Usuario usuario = new Usuario(driver);
        usuario.clicarEmCadastrese();
        usuario.inserirNomeUsuario(NOME_NOVO);
        usuario.inserirSenha("teste123");
        usuario.inserirConfirmacaoDeSenha("teste123");
        usuario.clicarEmCadastrar();

    }
}
