def call(){
    sh 'mvn verify -DskipUnitTests=true'
}