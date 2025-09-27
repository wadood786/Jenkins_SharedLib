def call(){
  sh "trivy fs --timeout 20m --exit-code 0 --severity HIGH,CRITICAL ."

}
