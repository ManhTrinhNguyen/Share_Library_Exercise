#!/user/bin/env groovy

def call (String BRANCH_NAME){
    withCredentials([
        usernamePassword(credentialsId: 'Github_Credential', usernameVariable: 'USER', passwordVariable: 'PWD')
    ]){
    // To set configuration that kept in .git folder and global configuration in git .
    // I want to set git config Global I can put a flag --global
    sh 'git config --global user.email "jenkin@gmail.com"' // If there is no User Email at all, Jenkin will complain when commiting changes . It will say there is no email that was detected to attach to as a metadata to that commit
    sh 'git config --global user.name "Jenkins"'

    // Set Origin access
    sh "git remote set-url origin https://${USER}:${PWD}@${GIT_URL}"

    sh "git add ."
    sh 'git commit -m "ci: version bump"'
    sh "git push origin HEAD:${BRANCH_NAME}"
    }
}