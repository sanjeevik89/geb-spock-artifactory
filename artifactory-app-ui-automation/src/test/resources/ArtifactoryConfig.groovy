environments {
    test_success {
        urlWithoutForwardSlash = "http://localhost:8081"
        urlWithoutForwardSlash = urlWithoutForwardSlash.toLowerCase()
        urlWithForwardSlash = urlWithoutForwardSlash + "/"
    }

    test_failure {
        urlWithoutForwardSlash = "http://localhost:8081"
        urlWithoutForwardSlash = urlWithoutForwardSlash.toLowerCase()
        urlWithForwardSlash = urlWithoutForwardSlash + "/"
    }

    prod {
        urlWithoutForwardSlash = "http://prod.artifactory.ep:8081/"
        urlWithoutForwardSlash = urlWithoutForwardSlash.toLowerCase()
        urlWithForwardSlash = urlWithoutForwardSlash + "/"
    }
}