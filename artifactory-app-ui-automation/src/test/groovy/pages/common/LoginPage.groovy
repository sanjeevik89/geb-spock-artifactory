/*
 * Copyright (c) 2018. https://automationschool.com
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package pages.common

import pages.base.ArtifactoryPage

class LoginPage extends ArtifactoryPage {

    static url = "artifactory/webapp/#/login"

    static content = {
        loginBlock()  { $('div.center-login.ng-scope') }
        loginButtonsContainer()  { loginBlock.find('.login-button-bar.ng-scope') }
        loginButton() { loginButtonsContainer.find('button#login.btn.btn-primary.pull-right') }
        usernameField() { loginBlock.find('#user') }
        passwordField() { loginBlock.find('#password') }
    }

    static at = {
        loginBlock.isDisplayed()
        loginButtonsContainer.isDisplayed()
        loginButton.isDisplayed()
        usernameField.isDisplayed()
        passwordField.isDisplayed()
    }


    def enterLoginDetails(login, password){
        usernameField.value(login)
        passwordField.value(password)
    }

    def clickOnLoginButton(){
        loginButton.click()
    }
}