def call(String reponame, String imagename, String imagetag){
   sh  """docker build -t ${reponame}/${imagename} .
          docker tag ${reponame}/${imagename}  ${reponame}/${imagename}:${imagetag}
          docker tag ${reponame}/${imagename}  ${reponame}/${imagename}:latest """
}
