#!/user/bin/env groovy

def call () {
    echo "Push Image to Docker Hub"
    sh "docker push ${DOCKER_REPO}:${IMAGE_NAME}"
}