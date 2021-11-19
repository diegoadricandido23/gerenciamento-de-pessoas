#!/usr/bin/env groovy
pipeline {
    agent {
       docker { image 'maven:3.8.1-adoptopenjdk-11' }
    }
    stages {
        stage('build') {
            	echo "Build Application"
                sh 'mvn clean install -DskipTests'
            }
        }
        stage('test') {
            steps {
            	echo "Run Test Application"
                sh 'mvn test'
            }
        }
    }
}
