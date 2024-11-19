def call(String Project, String ImageTag,String DockerHub){
withCredientials(usernamePassword(credentialsId:"DockerHub","dockerHubpass",usernameVariable:"DockerHubUser"){
sh "docker login -u ${DockerHubUser} -p ${dockerHubpass}"
}
sh'docker push ${DockerHubUser}/${Project}:${ImageTag}'
}
