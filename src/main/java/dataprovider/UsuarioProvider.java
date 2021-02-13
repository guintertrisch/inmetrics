package dataprovider;

import org.testng.annotations.DataProvider;

public class UsuarioProvider {

    @DataProvider(name = "dados_usuarios")
    public Object[][] createData1() {
        return new Object[][]{
                {"Juliana123", "teste123"},
                {"DonaVilma123", "teste123"},
        };
    }

}
