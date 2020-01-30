import geb.Browser
import geb.spock.GebReportingSpec
import pages.base.ArtifactoryPage
import pages.common.HomePage
import pages.common.LandingPage
import pages.common.LoginPage
import pages.common.SearchPage
import spock.lang.Shared
import spock.lang.Stepwise

@Stepwise
class LoginLogoutSpec extends GebReportingSpec {
    @Shared cfg
    @Shared username
    @Shared password
    @Shared artifact

    def setupSpec() {
        cfg = ConfigReader.getConfiguration()
        ArtifactoryPage.config = cfg;
        username = cfg.loginFlowConfig.username
        password = cfg.loginFlowConfig.password
        artifact = cfg.searchFlowConfig.search_artifact
    }

    def cleanupSpec() {
    }

    def setup() {
        baseUrl = cfg.urlWithForwardSlash
    }

    def "Login with valid username and password"() {
        given: "You are on Artifactory homepage"
        to HomePage        
        HomePage homePage = at HomePage;
        report("Artifactory Login Page")
       

        when: "Check you are on login page"
        LoginPage loginPage = at LoginPage;
        
        then: "Enter valid Login & Password"
        loginPage.enterLoginDetails(username, password)
        // report("Artifactory Login Page with username and password")
        loginPage.clickOnLoginButton()
    

        then: "Check you are on landing page"
        at LandingPage
        report("Artifactory Landing Page for username - " + username)
    }

    def "Search"() {
        given: "You are on landing page"
        LandingPage landingPage = at LandingPage

        when:"Search Artifact"
        landingPage.clickOnSearch(artifact)

        then: "wait for couple of secs"
        // report("Artifact entered in search box")
        Thread.sleep 2000

        and:"Go to searchPage"
        SearchPage searchPage = at SearchPage
        Thread.sleep 2000

        when:"Validate artifact present"
        report("Artifactory search Page for artifact - " + artifact)

        then: "Go to Landing Page"
        searchPage.clickOnHome()
    }

    def "Logout"() {
        given: "You are on landing page"
        LandingPage landingPage = at LandingPage

        when: "You click on logout"
        landingPage.clickOnLogout()

        then: "Check you are back on the Home Page"
        at HomePage
        // report("Back to Home Page after logout")
    }
}