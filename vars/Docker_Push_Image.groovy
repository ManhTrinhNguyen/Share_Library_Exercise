#!/user/bin/env groovy

def call () {
    sh "docker push ${IMAGE_NAME}"
    echo "Push Image Success ....."
}