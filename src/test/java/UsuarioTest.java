import dataprovider.UsuarioProvider;
import locators.Usuario;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UsuarioTest extends BaseTest {

    @Test(dataProvider = "dados_usuarios", dataProviderClass = UsuarioProvider.class)
    public void deveCadatrarUsuarioComSucesso(String nome, String senha) {
        Usuario usuario = new Usuario(driver);
        usuario.clicarEmCadastrese();
        usuario.inserirNomeUsuario(nome);
        usuario.inserirSenha(senha);
        usuario.inserirConfirmacaoDeSenha(senha);
        usuario.clicarEmCadastrar();
        assertEquals(usuario.retornaLabelLogin(), "Login");
    }
}
