def call(String Project, String ImageTag, String DockerHub) {
    withCredentials([usernamePassword(credentialsId: 'DockerHub', usernameVariable: 'DockerHubUser', passwordVariable: 'DockerHubPass')]) {
        sh "docker login -u ${DockerHubUser} -p ${DockerHubPass}"
    }
    sh "docker push ${DockerHubUser}/${Project}:${ImageTag}"
}
