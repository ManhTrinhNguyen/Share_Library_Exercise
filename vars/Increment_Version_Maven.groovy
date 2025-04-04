def call(String major, String minor, String incremental) {
    echo 'Increment App Version ...'
    sh "mvn build-helper:parse-version versions:set \
        -DnewVersion=\\${major}.\\${minor}.\\${incremental} \
         versions:commit"

    def matcher = readFile('pom.xml') =~ '<version>(.+)</version>'
    def version = matcher[0][1]
    env.IMAGE_NAME = "java-maven-$version-$BUILD_NUMBER"
}