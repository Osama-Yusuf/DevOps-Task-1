// pull code from git hub then build an image then push it to dockerhub and deploy to kubernetes

pipeline {
    agent any
    stages {
        stage('Pull code from git hub') {
            steps {
                git 'path to git hub'
            }
        }
        stage('Build an image') {
            steps {
                sh 'docker build -t image_name .'
            }
        }
        stage('Push image to dockerhub') {
            steps {
                sh 'docker login -u username -p password'
                sh 'docker tag image_name username/image_name'
                sh 'docker push username/image_name'
            }
        }
        stage('Deploy to kubernetes') {
            steps {
                sh 'kubectl apply -f k8s/node-deployment.yaml'
                sh 'kubectl apply -f k8s/nodeport.yaml'
            }
        }
    }
}