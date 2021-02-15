package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Usuario {
    private WebDriverWait wait;
    private By usuario = By.name("username");
    private By senha = By.name("pass");
    private By confirmarSenha = By.name("confirmpass");
    private By botaoCadastrar = By.cssSelector("button[class=\"login100-form-btn\"]");
    private By labelUsuarioJaCadastrado = By.xpath("//div[contains(text(),\"Usuário já cadastrado\")]");
    private By labelLogin = By.cssSelector("span[class=\"login100-form-title p-b-1\"]");
    private By botaoCadastrese = By.linkText("Cadastre-se");

    public Usuario(WebDriver driver) {
        this.wait = new WebDriverWait(driver, 45);
    }

    private WebElement linkCadastrese() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(botaoCadastrese));
    }

    private WebElement labelLogin() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(labelLogin));
    }

    private WebElement usuario() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(usuario));
    }

    private WebElement senha() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(senha));
    }

    private WebElement confirmarSenha() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(confirmarSenha));
    }

    private WebElement botaoCadastrar() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(botaoCadastrar));
    }

    private WebElement labelUsuarioJaCadastrado() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(labelUsuarioJaCadastrado));
    }

    public void clicarEmCadastrese() {
        linkCadastrese().click();
    }

    public void inserirNomeUsuario(String nomeUsuario) {
        usuario().sendKeys(nomeUsuario);
    }

    public void inserirSenha(String password) {
        senha().sendKeys(password);
    }

    public void inserirConfirmacaoDeSenha(String senhaConfirmacao) {
        confirmarSenha().sendKeys(senhaConfirmacao);
    }

    public void clicarEmCadastrar() {
        botaoCadastrar().click();
    }

    public String retornaLabelUsuarioJaCadastrado() {
        return labelUsuarioJaCadastrado().getText();
    }

    public String retornaLabelLogin() {
        return labelLogin().getText();
    }
}
