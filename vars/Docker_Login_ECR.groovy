def call() {
  withCredentials([
    usernamePassword(credentialsId: 'AWS_Credential', usernameVariable: 'USER', passwordVariable: 'PWD')
  ]){
    sh "echo ${PWD} | docker login --username ${USER} --password-stdin ${ECR_URL}"

    echo "Login successfully"
}