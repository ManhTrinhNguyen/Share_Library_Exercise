#!/user/bin/env groovy

package com.example

class Docker implements Serializable {

    def script

    Docker(script) {
        this.script = script
    }

    def buildDockerImage(){
        script.echo "build Image"
        script.sh "docker build -t ${DOCKER_REPO}:${IMAGE_NAME} ."
    }

    def dockerLogin(){
        script.echo "Login to Docker Hub"

        script.withCredentials([
                script.usernamePassword(credentialsId: 'Docker_Hub_Credential', usernameVariable: 'USER', passwordVariable: 'PWD')
        ]){
            script.sh "echo '${script.PWD}' | docker login -u '${script.USER}' --password-stdin"
        }
    }

    def pushDockerImage() {
        script.echo "Push Image to Docker Hub"
        script.sh "docker push '${script.DOCKER_REPO}':'${script.IMAGE_NAME}'"
    }


}
