def call(){
  echo "Build Gradle Jar ...."

  sh 'gradle clean build'
}