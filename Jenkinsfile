#!/usr/bin/env groovy

library identifier: 'jenkins-shared-library@main', retriever: modernSCM(
        [$class: 'GitSCMSource',
         remote: 'https://github.com/Rahul-Kumar-Paswan/jenkins-shared-library.git',
         credentialsId: 'git-credentials'
        ]
)


def gv

pipeline {
    agent any
   
    stages {
        stage("init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage("build jar") {
            steps {
                script {
                    echo "Build Jar"
                    buildJar()
                }
            }
        }
        stage("build and push image") {
            steps {
                script {
                    echo "Build and Push Image"
                    buildImage 'rahulkumarpaswan/python-demo:1.5'
                    dockerLogin()
                    dockerPush 'rahulkumarpaswan/python-demo:1.5'
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    echo "Deploy Application"
                    gv.deployApp()
                }
            }
        }
    }
}
