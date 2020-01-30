environments {
    test_success {
		//testing happy path.
        search_artifact = "Bookstore.war"
    }

    test_failure {
        //testing failure
        search_artifact = "test.jar"
    }

    prod {
		//testing happy path
        search_artifact = "test.war"
    }
}