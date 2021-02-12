import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

public class FuncionarioTest extends BaseTest {
    static final String NOME = "Funcionario numero 10";
    static final String NOMEEDITADO = "NomeEditado";


    @Test(priority = 0)
    public void deveCadastrarNovoFuncionarioComSucesso() {
        login.realizarLogin();
        funcionario.clicarNoLinkNovoFuncionario();
        funcionario.preencherNome(NOME);
        funcionario.preencherCpf(novoCpf);
        funcionario.preencherSexoMasculino();
        funcionario.preencherAdmissao("12/12/2021");
        funcionario.preencherCargo("Testador");
        funcionario.preencherSalario("256895");
        funcionario.marcarTipoContratacaoClt();
        funcionario.clicarEmEnviar();
        assertNotNull(funcionario.retornaMensagemDeSucesso());

    }

    @Test(priority = 1)
    public void deveEditarFuncionarioComSucesso() {
        funcionario.preencherNomeParaPesquisa(NOME);
        funcionario.clicarEmEditarFuncionario();
        funcionario.preencherNome(NOMEEDITADO);
        funcionario.preencherSexoFeminino();
        funcionario.marcarTipoContratacaoPj();
        funcionario.clicarEmEnviar();
        assertNotNull(funcionario.retornaMensagemDeSucesso());

    }

    @Test(priority = 2)
    public void deveDeletarFuncionarioComSucesso() {
        funcionario.preencherNomeParaPesquisa("NomeEditado");
        funcionario.clicarEmDeletarFuncionario();
        assertNotNull(funcionario.retornaMensagemDeSucesso());
    }

}
