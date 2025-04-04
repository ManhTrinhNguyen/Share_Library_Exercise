#!/user/bin/env groovy

def call (){
    withCredentials([
            usernamePassword(credentialsId: 'Github_Credential', usernameVariable: 'USER', passwordVariable: 'PWD')
    ]) {
        sh 'git config --global user.email "jenkin@gmail.com"'
        sh 'git config --global user.name "Jenkin"'

        sh "git remote set-url origin https://${USER}:${PWD}@github.com/ManhTrinhNguyen/Jenkin-Exercise-Java-Maven.git"
        sh 'git add .'
        sh 'git commit -m "ci: version bump"'
        sh "git push origin HEAD:Use_Share_Library"
    }
}