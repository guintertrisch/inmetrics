package dataprovider;

import org.testng.annotations.DataProvider;
import utils.GeradorNumeroUsuario;

public class UsuarioProvider {

    @DataProvider(name = "dados_usuarios")
    public Object[][] createData1() {
        return new Object[][]{
                {"Ana"+ GeradorNumeroUsuario.retornaNovoNumero(), "teste123"},
                {"Maria"+GeradorNumeroUsuario.retornaNovoNumero(), "teste123"},
        };
    }

}
