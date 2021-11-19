#!/usr/bin/env groovy
pipeline {
    agent {
       docker { image 'node:14-alpine' }
    }
    steps {
    stages {
        stage('build') {
            	echo "Build Application"
                sh 'mvn clean install -DskipTests'
            }
        }
        stage('test') {
            agent {
                docker { image 'maven' }
            }
            steps {
            	echo "Run Test Application"
                sh 'mvn test'
            }
        }
    }
}
