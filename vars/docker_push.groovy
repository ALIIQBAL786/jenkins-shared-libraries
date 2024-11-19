def call(String Project, String ImageTag,String DockerHub){
withCredientials(usernamePassword(credentialsId:"DockerHub","dockerHubpass",usernameVariable:"DockerHubUser"){
sh "docker login -u ${env.DockerHubUser} -p ${env.dockerHubpass}"
sh "docker push ${env.DockerHubUser}/${Project}:${ImageTag}"
}
}
