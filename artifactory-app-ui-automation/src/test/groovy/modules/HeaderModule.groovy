package modules

import geb.Module

class HeaderModule extends Module {
    static content = {
        navBar (required: true) {$("nav#jf-header")}
        navBarRight (required: true) { navBar.find('div.navbar-right')}
        currentUserDropdownArrow (required: true, wait: true) { navBarRight.find('i.action-icon.icon.icon-small-arrow-down')}
        currentUserDropdown (required: true, wait: true) { navBarRight.find('dropdown-menu.dropdown-menu-right.actions-dropdown.text-left') }
        logoutButton (required: false, wait: true) { $("#jf-header > div.navbar-right > div.pull-right.header-section.ng-scope.quick-actions > div > div > jf-actions > ul > li > span > ul > li.action-item.dynamic-action.ng-scope.menu-item-icon-logout")}
    }
    
    def clickOnLogout(){
        currentUserDropdownArrow.click()
        logoutButton.click()
    }
}
