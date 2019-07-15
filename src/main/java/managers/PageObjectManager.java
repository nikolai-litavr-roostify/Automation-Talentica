package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.*;
import pageObjects.loanApplications.*;

public class PageObjectManager {

    private LoanSection ls;

    private EmploymentSection es;

    private IncomeSection is;

    private AssetsLiabilitiesSection asl;

    private DeclarationsSection dl;

    private ApplicationRelease ap;

    private WebDriver driver;

    private LoginPage lp;

    private AddLoanManuallyPage alm;

    private InviteBorrowerPage ib;
    private AboutYouSection ay;
    private CopyReferalPage cr;
    private SignUpPage su;
    private Coborrowerflowpage cob;
    private ConnectionPage con;
    private MessagesPage msg;

    public PageObjectManager(WebDriver driver) {

        this.driver = driver;

    }

    public LoginPage getLoginPage(){

        return (lp == null) ? lp = new LoginPage(driver) : lp;

    }

    public AddLoanManuallyPage getAddLoanManuallyPage() {

        return (alm == null) ? alm = new AddLoanManuallyPage(driver) : alm;

    }

    public LoanSection getLoanSectionPage()
    {
        return (ls== null) ? ls = new LoanSection(driver) : ls;
    }

    public EmploymentSection getEmploymentSectionPage()
    {
        return (es == null) ? es = new EmploymentSection(driver) : es;
    }

    public IncomeSection getIncomeSectionPage()
    {
        return (is == null) ? is = new IncomeSection(driver) : is;
    }

    public AssetsLiabilitiesSection getAssetsLiabilitiesSectionPage()
    {
        return (asl == null) ? asl = new AssetsLiabilitiesSection(driver) : asl;
    }

    public DeclarationsSection getDeclarationsSectionPage() {

        return (dl == null) ? dl = new DeclarationsSection(driver) : dl;

    }
    public ApplicationRelease getApplicationReleasePage() {

        return (ap == null) ? ap = new ApplicationRelease(driver) : ap;

    }

    public InviteBorrowerPage getInviteBorrowerPage()
    {
        return (ib == null) ? ib = new InviteBorrowerPage(driver) : ib;
    }

    public AboutYouSection getAboutYouPage()
    {
        return (ay == null) ? ay = new AboutYouSection(driver) : ay;
    }

    public CopyReferalPage getCopyReferalPage()
    {
        return (cr == null) ? cr = new CopyReferalPage(driver) : cr;
    }

    public SignUpPage getSignUpPage()
    {
        return (su == null) ? su = new SignUpPage(driver) : su;
    }

    public Coborrowerflowpage getCoborrowerPage()
    {
        return (cob == null) ? cob = new Coborrowerflowpage(driver) : cob;
    }

    public ConnectionPage getConnectionPage()
    {
        return (con == null) ? con = new ConnectionPage(driver) : con;
    }

    public MessagesPage getMessagePage()
    {
        return (msg == null) ? msg = new MessagesPage(driver) : msg;
    }

    public WebDriver getDriver() {
        return driver;
    }
}