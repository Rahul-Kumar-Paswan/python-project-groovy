#!/usr/bin/env groovy

// @Library('jenkins-shared-library')
library identifier: 'jenkins-shared-library@main',retriever: modernSCM(
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
        /* stage("checking") {
            steps {
                script {
                    echo "checking"
                    check()
                }
            }
        } */
        stage("build image") {
            steps {
                script {
                    echo "building image ....."
                    buildImage 'rahulkumarpaswan/python-demo:1.5'
                    dockerLogin()
                    pushImage 'rahulkumarpaswan/python-demo:1.5'
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    echo "deploying"
                    gv.deployApp()
                }
            }
        }
    }   
}