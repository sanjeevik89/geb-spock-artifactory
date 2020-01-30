package pages.common

import pages.base.ArtifactoryPage

class HomePage extends ArtifactoryPage {

    static url = "artifactory/webapp/#/login"

    static content = {
        loginBlock()  { $('div.center-login.ng-scope') }
        loginButtonsContainer()  { loginBlock.find('.login-button-bar.ng-scope') }
        loginButton() { loginButtonsContainer.find('button#login.btn.btn-primary.pull-right')}
        usernameField() { loginBlock.find('#user')}
        passwordField() { loginBlock.find('#password')}
    }

    static at = {
        loginBlock.isDisplayed()
        loginButtonsContainer.isDisplayed()
        loginButton.isDisplayed()
        usernameField.isDisplayed()
        passwordField.isDisplayed()
    }

    def enterLoginDetails(username, password){
        usernameField.value(username)
        passwordField.value(password)
    }

    def clickOnLoginButton(){
        loginButton.click()
    }
}
