def call(String sonarToken){
     
    sh 'mvn  clean package sonar:sonar mvn -Dsonar.token="${sonarToken}"'

}