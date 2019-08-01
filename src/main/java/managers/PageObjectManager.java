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

    private AddLoanManuallyPreConPage alm;

    private InviteBorrowerPage ib;
    private AboutYouSection ay;
    private CopyReferalPage cr;
    private SignUpPage su;
    private Coborrowerflowpage cob;
    private ConnectionPage con;
    private MessagesPage msg;
    private AddLoanManuallyPreFHAPage addLoanManuallyPreFHAPage;
    private AddLoanManuallyPreVaPage addLoanManuallyPreVaPage;
    private AddLoanManuallyPreUSDAPage addLoanManuallyPreUSDAPage;
    private AddLoanManuallyHomeConPage addLoanManuallyHomeConPage;
    private AddLoanManuallyRefinanceConPage addLoanManuallyRefinanceConPage;
    private AddLoanManuallyHelocPage addLoanManuallyHelocPage;
    private TeamPage teamPage;
    private UserPage userPage;

    public PageObjectManager(WebDriver driver) {

        this.driver = driver;

    }

    public LoginPage getLoginPage(){

        return (lp == null) ? lp = new LoginPage(driver) : lp;

    }

    public AddLoanManuallyPreConPage getAddLoanManuallyPage() {

        return (alm == null) ? alm = new AddLoanManuallyPreConPage(driver) : alm;

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

    public AddLoanManuallyPreFHAPage getAddLoanManuallyPreFHAPage()
    {
        return (addLoanManuallyPreFHAPage == null) ? addLoanManuallyPreFHAPage = new AddLoanManuallyPreFHAPage(driver) : addLoanManuallyPreFHAPage;
    }

    public AddLoanManuallyPreVaPage getAddLoanManuallyPreVaPage()
    {
        return (addLoanManuallyPreVaPage == null) ? addLoanManuallyPreVaPage = new AddLoanManuallyPreVaPage(driver) : addLoanManuallyPreVaPage;
    }

    public AddLoanManuallyPreUSDAPage getAddLoanManuallyPreUSDAPage()
    {
        return (addLoanManuallyPreUSDAPage == null) ? addLoanManuallyPreUSDAPage = new AddLoanManuallyPreUSDAPage(driver) : addLoanManuallyPreUSDAPage;
    }

    public AddLoanManuallyHomeConPage getAddLoanManuallyHomeConPage()
    {
        return (addLoanManuallyHomeConPage == null) ? addLoanManuallyHomeConPage = new AddLoanManuallyHomeConPage(driver) : addLoanManuallyHomeConPage;
    }

    public AddLoanManuallyRefinanceConPage getAddLoanManuallyRefinanceConPage()
    {
        return (addLoanManuallyRefinanceConPage == null) ? addLoanManuallyRefinanceConPage = new AddLoanManuallyRefinanceConPage(driver) : addLoanManuallyRefinanceConPage;
    }

    public AddLoanManuallyHelocPage getAddLoanManuallyHelocPage()
    {
        return (addLoanManuallyHelocPage == null) ? addLoanManuallyHelocPage = new AddLoanManuallyHelocPage(driver) : addLoanManuallyHelocPage;
    }

    public TeamPage getTeamPage()
    {
        return (teamPage == null) ? teamPage = new TeamPage(driver) : teamPage;
    }

    public UserPage getUserPage(){return  (userPage == null) ? userPage = new UserPage(driver) : userPage; }

    public WebDriver getDriver() {
        return driver;
    }
}