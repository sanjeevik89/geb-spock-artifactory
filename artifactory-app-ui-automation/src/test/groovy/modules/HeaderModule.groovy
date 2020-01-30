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

package modules

import geb.Module

class HeaderModule extends Module {
    static content = {
        navBar (required: true) {$("nav#jf-header")}
        navBarRight (required: true) { navBar.find('div.navbar-right')}
        currentUserDropdownArrow (required: true, wait: true) { navBarRight.find('i.action-icon.icon.icon-small-arrow-down')}
        currentUserDropdown (required: false, wait: true) { navBarRight.find('dropdown-menu.dropdown-menu-right.actions-dropdown.text-left') }
        logoutButton (required: false, wait: true) { currentUserDropdown.find('li.action-item.dynamic-action.ng-scope.menu-item-icon-logout')}
    }

    def clickOnLogout(){
        currentUserDropdown.click()
        logoutButton.click()
    }
}
