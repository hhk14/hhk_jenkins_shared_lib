def call(String sonarToken){
    withSonarQubeEnv(credentialsId: sonarToken ) {
        sh 'mvn  clean package sonar:sonar'
    }
     
    

}