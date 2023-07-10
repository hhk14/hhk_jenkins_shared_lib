def call(String sonarToken, qualitygateToken){
    waitForQualityGate abortPipeline: false, credentialsId: 'sonar-jenkins'
}