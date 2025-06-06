def call (String Update_Version) {
  echo "Increment App Version"

  sh "gradle ${Update_Version}"   // To Increase Major Version : gradle majorVersionUpdate,  To Increase Minor Version : gradle minorVersionUpdate , To Increase Patch Version : gradle patchVersionUpdate


  def version = readProperties(file: 'version.properties')

  env.IMAGE_NAME = "${ECR_REPO}:${version['major']}.${version['minor']}.${version['patch']}"

  echo "${env.IMAGE_NAME}"
}