def call(String reponame, String imagename){
   sh  'docker build -t ${reponame}/${imagename} .
   sh 'docker tag "${reponame}/${imagename}  ${reponame}/${imagename}:${imagetag}"'
   sh 'docker tag "${reponame}/${imagename}  ${reponame}/${imagename}:latest'
}
