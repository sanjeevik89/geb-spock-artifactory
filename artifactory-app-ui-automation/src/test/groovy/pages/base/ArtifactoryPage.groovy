package pages.base

import geb.Page
import modules.HeaderModule

abstract class ArtifactoryPage extends Page {

    static ConfigObject config

    static at = {
        //we will check this for all artifactory pages derived from this page
        browser.getCurrentUrl().toLowerCase().startsWith(config.urlWithoutForwardSlash)
    }

    static content = {
        artifactoryHeader (required: false, wait: true) { module HeaderModule }
    }

    def clickOnLogout(){
        artifactoryHeader.clickOnLogout()
    }
}
