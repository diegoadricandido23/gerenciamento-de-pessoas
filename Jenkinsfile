#!/usr/bin/env groovy
pipeline {
    agent {
       docker { image 'maven:3.8.1-adoptopenjdk-11' }
    }
    stages {
        stage('Build') {
            echo 'Build Application'
            sh 'mvn clean install -DskipTests'
        }
        stage('Test') {
            echo 'Run Test Application'
            sh 'mvn test'
        }
    }
}