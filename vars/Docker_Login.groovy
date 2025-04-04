#!/user/bin/env groovy

// This line above is let my editor detect that I am working with Groovy script . I can use the same annotation in Jenkinfiles to let my editor know that I am working with Groovy script bcs the function has no .groovy

def call() {
    echo "Login to Docker Hub"

    withCredentials([
            usernamePassword(credentialsId: 'Docker_Hub_Credential', usernameVariable: 'USER', passwordVariable: 'PWD')
    ]){
        sh "echo ${PWD} | docker login -u ${USER} --password-stdin"
    }
}
