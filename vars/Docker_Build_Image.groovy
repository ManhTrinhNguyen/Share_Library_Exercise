#!/user/bin/env groovy

def call () {
    echo "Build Docker Image ...."

    sh "docker build -t ${env.IMAGE_NAME} ."
}