#!/user/bin/env groovy

def call() {
    echo 'Build Maven Jar'
    sh 'sh mvn clean package'
}