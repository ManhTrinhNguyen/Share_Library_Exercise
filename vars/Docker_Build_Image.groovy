#!/user/bin/env groovy

def call () {
    echo "build Image"
    sh "docker build -t ${DOCKER_REPO}:${IMAGE_NAME} ."
}