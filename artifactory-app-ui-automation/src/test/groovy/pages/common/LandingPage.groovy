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

class LandingPage extends ArtifactoryPage {

    static url = ""

    static content = {
        screenNameLink(wait: true) { $('a.navbar-link.username-header.ng-binding') }
    }

    static at = {
        screenNameLink.isDisplayed()
        screenNameLink.text().toLowerCase().contains(config.loginFlowConfig.username.toLowerCase())
    }
}