#!/user/bin/env groovy

// This line above is let my editor detect that I am working with Groovy script . I can use the same annotation in Jenkinfiles to let my editor know that I am working with Groovy script bcs the function has no .groovy

def call() {
    echo 'Build Maven Jar'
    sh 'sh mvn clean package'
}