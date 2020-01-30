environments {
    test_success {
		//testing happy path.
        username = "admin"
        password = "ULcht3WGeHKCWqR"
        search_artifact = "Bookstore.war"
    }

    test_failure {
        username = "dummytestuser"
        password = "dummytestpassword"
        search_artifact = "test.jar"
    }

    prod {
		//For the username, do not use the email but the artifactory user without the @ sign in the front.
        username = "dummyproduser"
        password = "dummyprodpassword"
        search_artifact = "test.war"
    }
}