pipeline{
    
    environment {
        registry = "sawrub/studentapisurvey"
        registryCredential = 'dockerhub'
        def dateTag = new Date().format("yyyyMMdd-HHmmss")
	}
agent any
    tools{
        maven 'Maven 3.8.6'
    }
    stages{
     stage('Installing Maven'){
        steps{
            script{
                sh 'mvn clean'
                sh 'mvn install'
            }
        }
     }
     stage('Build and Push Docker Image'){
        steps{
            script {
                  docker.withRegistry('',registryCredential) {
                        def image = docker.build('sawrub/studentapisurvey:'+ dateTag, '. --no-cache')
                        docker.withRegistry('',registryCredential) {
                            image.push()
                        }
                    }
            }
        }
     }
      stage('Deploying to Nodeport in Rancher '){
        steps{
            script {
                  sh 'kubectl set image deployment/deploy1 container-0=sawrub/studentapisurvey:'+dateTag
            }
        }
     }
     }
 
  post {
	  always {
			sh 'docker logout'
		}
	}    
}
