import locators.Funcionario;
import locators.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.Browsers;
import utils.GeradorDeCpf;
import utils.GeradorNumeroUsuario;

@Listeners({utils.Listeners.class})
public class BaseTest {
    public static final String FUNCIONARIO = "Funcionario numero 10";
    public static final String NOMEEDITADO = "NomeEditado";
    public static final String NOME_NOVO = "Funcionario " + GeradorNumeroUsuario.retornaNovoNumero();
    public static final String NOVO_CPF = GeradorDeCpf.cpf(true);
    public static final String SENHA = "teste123";
    public static final String USUARIO_PADRAO = "operacao763";
    public WebDriver driver;
    public Login login;
    public Funcionario funcionario;
    ;

    @BeforeClass
    @Parameters("browser")
    public void setUpTest(@Optional("chrome") String browser) {
        Browsers browsers = new Browsers();
        driver = browsers.getDriver(browser);
        driver.get("https://inm-test-app.herokuapp.com/accounts/login/");
        login = new Login(driver);
        funcionario = new Funcionario(driver);
    }

    @AfterClass
    public void browserClose() {
        driver.quit();
    }
}
