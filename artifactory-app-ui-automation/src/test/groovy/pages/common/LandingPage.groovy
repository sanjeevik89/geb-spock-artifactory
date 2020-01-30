package pages.common
import pages.base.ArtifactoryPage

class LandingPage extends ArtifactoryPage {

    static url = ""

    static content = {
        screenNameLink(wait: true) { $('a.navbar-link.username-header.ng-binding') }
        // searchButton (required: true) { $("#jf-header > div.navbar-right > jf-header-search > form > div > div > span")}
        // searchText   { $("#jf-header > div.navbar-right > jf-header-search > form > div > div > input")} 
        searchText   (required:true) {$"#quick"}
        searchButton (required:true) {$"#quickSearch > div > form > div > div > span"}
    }

    static at = {
        screenNameLink.isDisplayed()
        searchButton.isDisplayed()
        searchText.isDisplayed()
        screenNameLink.text().toLowerCase().contains(config.loginFlowConfig.username.toLowerCase())
    }

    def clickOnSearch(searchArtifact) {
        searchText.value(searchArtifact)
        searchButton.click()
    }
}
