import dataprovider.UsuarioProvider;
import locators.Usuario;
import org.testng.annotations.Test;

public class UsuarioTest extends BaseTest {

    @Test(dataProvider = "dados_usuarios", dataProviderClass = UsuarioProvider.class)
    public void deveCadatrarUsuarioComSucesso(String nome, String senha) {
        Usuario usuario = new Usuario(driver);
        usuario.clicarEmCadastrese();
        usuario.inserirNomeUsuario(nome);
        usuario.inserirSenha(senha);
        usuario.inserirConfirmacaoDeSenha(senha);
        usuario.clicarEmCadastrar();

    }
}
