package pages.common
import pages.base.ArtifactoryPage

class SearchPage extends ArtifactoryPage {

    static url = ""

    static content = {
        artifactsGrid (required:false, wait:true) { $("#jf-content > ui-view > form > div > div > div > jf-grid") }
        artifactsList (required:false, wait:true) { artifactsGrid.find('div.ui-grid-render-container.ng-isolate-scope.ui-grid-render-container-body') }
        artifactLink  (required:false, wait:true) { artifactsList.find('div.ui-grid-viewport.ng-isolate-scope') }
        homeButton    (required:false)             { $("#jf-header > div.navbar-header > a")}
    }

    static at = {
        artifactsGrid.isDisplayed()        
        artifactsList.isDisplayed()
        artifactLink.isDisplayed()
        homeButton.isDisplayed()
        artifactLink.text().toLowerCase().contains(config.searchFlowConfig.search_artifact.toLowerCase())
    }

    def clickOnHome() {        
        homeButton.click()
    }
}
