def call(String sonarToken){
    withCredentials([string(credentialsId: "${sonarToken}", variable: 'sonarIntegration')]) {
    sh 'mvn  clean package sonar:sonar mvn -Dsonar.token="${sonarIntegration}"'
}
}