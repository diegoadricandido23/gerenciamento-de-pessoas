#!/usr/bin/env groovy

pipeline {
    agent { 
    	docker { 
    		image 'maven:3.3.3' 
    	} 
    }
    stages {
        stage('build') {
            steps {
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