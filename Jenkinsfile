pipeline {
    agent any
    tools {
        maven 'Maven-3.9.6' // Must match the name you configured in Jenkins tools
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Aloofhoneybee/to-do-list-java.git'
            }
        }

        stage('Build with Maven') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t aloofhoneybee/todo-list-java:latest .'
            }
        }

        stage('Push to Docker Hub') {
            steps {
                withCredentials([string(credentialsId: 'dockerhub-pass', variable: 'DOCKER_PASS')]) {
                    sh 'echo "$DOCKER_PASS" | docker login -u aloofhoneybee --password-stdin'
                    sh 'docker push aloofhoneybee/todo-list-java:latest'
                }
            }
        }
    }
}
