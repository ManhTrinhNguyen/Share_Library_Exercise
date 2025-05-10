def call(String K8_Deploy_Yaml_file) {
  echo "Deploy Java Application "
  sh "envsubst < ${K8_Deploy_Yaml_file} | kubectl apply -f -"
}