def call () {
  echo "Increment App Version"

  sh "gradle patchVersionUpdate"   // To Increase Major Version : gradle majorVersionUpdate,  To Increase Minor Version : gradle minorVersionUpdate , To Increase Patch Version : gradle patchVersionUpdate


  def version = readProperties(file: 'version.properties')

  env.IMAGE_NAME = "${ECR_REPO}:${version['major']}.${version['minor']}.${version['patch']}"

  echo "${env.IMAGE_NAME}"
}