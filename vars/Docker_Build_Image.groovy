#!/user/bin/env groovy

def call () {
    echo "build Image"
    sh "docker build -t ${ECR_REPO}:${IMAGE_NAME} ."
}