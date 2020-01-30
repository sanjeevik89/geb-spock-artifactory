# geb-spock-artifactory

## Upload files to local artifactory using below command -

curl -uadmin:ULcht3WGeHKCWqR -T src/test/resources/bookstore.war "
http://localhost:8081/artifactory/gradle-dev-local/Bookstore.war"


## The output should look like this -

{
  "repo" : "gradle-dev-local",
  "path" : "/Bookstore.war",
  "created" : "2020-01-30T17:36:28.271Z",
  "createdBy" : "admin",
  "downloadUri" : "http://localhost:8081/artifactory/gradle-dev-local/Bookstore.war",
  "mimeType" : "application/java-archive",
  "size" : "17",
  "checksums" : {
    "sha1" : "33c0951329e05906a6e8030211cdd6031da1601e",
    "md5" : "973131af48aa1d25bf187dacaa5ca7c0",
    "sha256" : "d60a843866d592943af14111a4964f83728262f659af53a7fa82352492ec2801"
  },
  "originalChecksums" : {
    "sha256" : "d60a843866d592943af14111a4964f83728262f659af53a7fa82352492ec2801"
  },
  "uri" : "http://localhost:8081/artifactory/gradle-dev-local/Bookstore.war"
}
