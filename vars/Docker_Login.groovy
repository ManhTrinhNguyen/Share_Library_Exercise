#!/user/bin/env groovy

def call() {
    echo "Login to Docker Hub"

    withCredentials([
            usernamePassword(credentialsId: 'Docker_Hub_Credential', usernameVariable: 'USER', passwordVariable: 'PWD')
    ]){
        sh "echo ${PWD} | docker login -u ${USER} --password-stdin"
    }
}
