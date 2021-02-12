package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Funcionario {
    private static final String MASCULINO = "Masculino";
    private static final String FEMININO = "Feminino";
    private static final String INDIFERENTE = "Indiferente";
    private WebDriverWait wait;
    private By linkNovoFuncionario = By.cssSelector("a[href=\"/empregados/new_empregado\"]");
    private By nome = By.id("inputNome");
    private By cpf = By.id("cpf");
    private By sexo = By.id("slctSexo");
    private By admissao = By.id("inputAdmissao");
    private By cargo = By.id("inputCargo");
    private By salario = By.id("dinheiro");
    private By contratacaoClt = By.id("clt");
    private By contratacaoPj = By.id("pj");
    private By cancelar = By.cssSelector("input[value=\"Cancelar\"]");
    private By enviar = By.cssSelector("input[class=\"cadastrar-form-btn\"]");
    private By mensagemDeSucesso = By.cssSelector("div[class=\"alert alert-success alert-dismissible fade show\"]");
    private By pesquisarNomeFuncionario = By.cssSelector("input[type=\"search\"]");
    private By deletarFuncionario = By.id("delete-btn");
    private By editarFuncionario = By.cssSelector("button[class=\"btn btn-warning\"]");


    public Funcionario(WebDriver driver) {
        this.wait = new WebDriverWait(driver, 45);
    }

    private WebElement linkNovoFuncionario() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(linkNovoFuncionario));
    }

    private WebElement deletarFuncionario() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(deletarFuncionario));
    }

    private WebElement editarFuncionario() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(editarFuncionario));
    }

    private WebElement pesquisarNomeFuncionario() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(pesquisarNomeFuncionario));
    }

    private WebElement mensagemDeSucesso() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(mensagemDeSucesso));
    }

    private WebElement nome() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(nome));
    }

    private WebElement cpf() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cpf));
    }

    private WebElement sexo() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(sexo));
    }

    private WebElement admissao() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(admissao));
    }

    private WebElement salario() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(salario));
    }

    private WebElement cargo() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cargo));
    }

    private WebElement contratacaoClt() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(contratacaoClt));
    }

    private WebElement contratacaoPj() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(contratacaoPj));
    }

    private WebElement cancelar() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cancelar));
    }

    private WebElement enviar() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(enviar));
    }

    public void preencherNome(String nome) {
        nome().clear();
        nome().sendKeys(nome);
    }

    public void preencherCpf(String cpf) {
        cpf().sendKeys(cpf);
    }


    public void preencherSexoMasculino() {
        Select combo = new Select(sexo());
        combo.selectByVisibleText(MASCULINO);
    }

    public void preencherSexoFeminino() {
        Select combo = new Select(sexo());
        combo.selectByVisibleText(FEMININO);
    }

    public void preencherSexoIndiferente() {
        Select combo = new Select(sexo());
        combo.selectByVisibleText(INDIFERENTE);
    }

    public void preencherAdmissao(String data) {
        admissao().sendKeys(data);
    }

    public void preencherCargo(String cargo) {
        cargo().sendKeys(cargo);
    }

    public void preencherSalario(String salario) {
        salario().sendKeys(salario);
    }

    public void marcarTipoContratacaoClt() {
        contratacaoClt().click();
    }

    public void marcarTipoContratacaoPj() {
        contratacaoPj().click();
    }

    public void clicarEmEnviar() {
        enviar().click();
    }

    public void clicarCancelar() {
        cancelar().click();
    }

    public void clicarNoLinkNovoFuncionario() {
        linkNovoFuncionario().click();

    }

    public String retornaMensagemDeSucesso() {
        return mensagemDeSucesso().getText();
    }

    public void preencherNomeParaPesquisa(String funcionario) {
        pesquisarNomeFuncionario().sendKeys(funcionario, Keys.ENTER);

    }

    public void clicarEmDeletarFuncionario() {
        deletarFuncionario().click();
    }

    public void clicarEmEditarFuncionario() {
        editarFuncionario().click();
    }
}
