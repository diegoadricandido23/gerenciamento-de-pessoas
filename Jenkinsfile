#!/usr/bin/env groovy
pipeline {
    agent none
    stages {
        stage('build') {
            agent {
                docker { image 'maven' }
            }
            steps {
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