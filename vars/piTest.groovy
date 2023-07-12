def call(){
    sh " mvn org.pitest:pitest-maven:mutationCoverage"
    post{
        always{
            pitmutation mutationStatsFile: '**/target/pit-reports/**/mutations.xml'
        }
    }
}