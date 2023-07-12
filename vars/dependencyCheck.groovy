def call(){
    
        dependencyCheck additionalArguments: ''' 
            -o "./target/" 
            -s "./target/*.jar"
            -f "ALL" 
            --prettyPrint''', odcInstallation: 'DP-Check'
        dependencyCheckPublisher pattern: './target/dependency-check-report.xml'
              
}