package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    private WebDriverWait wait;
    private By labelLogin = By.cssSelector("span[class=\"login100-form-title p-b-1\"]");
    private By usuario = By.name("username");
    private By senha = By.name("pass");
    private By botaoEntre = By.cssSelector("button[class=\"login100-form-btn\"]");
    private By labelFuncionario = By.cssSelector("a[href=\"/empregados/\"]");

    public Login(WebDriver driver) {
        this.wait = new WebDriverWait(driver, 45);
    }

    private WebElement botaoEntre() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(botaoEntre));
    }

    private WebElement labelFuncionario() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(labelFuncionario));
    }


    private WebElement label() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(labelLogin));
    }

    private WebElement usuario() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(usuario));
    }

    private WebElement senha() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(senha));
    }

    public String retornaTextoLabelLogin() {
        return label().getText();
    }


    public void clicarEmEntre() {
        botaoEntre().click();
    }

    public void inserirNomeUsuario(String nomeUsuario) {
        usuario().sendKeys(nomeUsuario);
    }

    public void inserirSenha(String password) {
        senha().sendKeys(password);
    }

    public String retornaLabelFuncionarios() {
        return labelFuncionario().getText();
    }

    public void realizarLogin() {
        inserirNomeUsuario("operacao763");
        inserirSenha("teste123");
        clicarEmEntre();
    }
}
