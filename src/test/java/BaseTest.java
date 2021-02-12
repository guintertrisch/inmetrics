import locators.Funcionario;
import locators.Login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.Browsers;
import utils.GeradorDeCpf;
import utils.GeradorNumeroUsuario;

@Listeners({utils.Listeners.class})
public class BaseTest {
    public WebDriver driver;
    public String nomeNovo;
    public String novoCpf;
    public Login login;
    public Funcionario funcionario;

    @BeforeClass
    @Parameters("browser")
    public void setUpTest(@Optional("chrome") String browser) {
        Browsers browsers = new Browsers();
        driver = browsers.getDriver(browser);
        driver.get("https://inm-test-app.herokuapp.com/accounts/login/");
        nomeNovo = "Funcionario " + GeradorNumeroUsuario.retornaNovoNumero();
        novoCpf = GeradorDeCpf.cpf(true);
        login = new Login(driver);
        funcionario = new Funcionario(driver);
    }

    @AfterClass
    public void browserClose() {
        driver.quit();
    }
}
