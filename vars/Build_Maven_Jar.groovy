#!/user/bin/env groovy

def call() {
    echo 'Build Maven Jar'
    sh 'mvn clean package'
}