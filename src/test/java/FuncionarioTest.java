import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

public class FuncionarioTest extends BaseTest {

    @Test(priority = 0)
    public void deveCadastrarNovoFuncionarioComSucesso() {
        login.realizarLogin();
        funcionario.clicarNoLinkNovoFuncionario();
        funcionario.preencherNome(FUNCIONARIO);
        funcionario.preencherCpf(NOVO_CPF);
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
        funcionario.preencherNomeParaPesquisa(FUNCIONARIO);
        funcionario.clicarEmEditarFuncionario();
        funcionario.preencherNome(NOMEEDITADO);
        funcionario.preencherSexoFeminino();
        funcionario.marcarTipoContratacaoPj();
        funcionario.clicarEmEnviar();
        assertNotNull(funcionario.retornaMensagemDeSucesso());

    }

    @Test(priority = 2)
    public void deveDeletarFuncionarioComSucesso() {
        funcionario.preencherNomeParaPesquisa(NOMEEDITADO);
        funcionario.clicarEmDeletarFuncionario();
        assertNotNull(funcionario.retornaMensagemDeSucesso());
    }

}
