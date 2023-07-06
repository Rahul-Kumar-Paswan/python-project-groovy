#!/usr/bin/env groovy

@Library('jenkins-shared-library')
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
        stage("checking") {
            steps {
                script {
                    echo "checking"
                    check
                }
            }
        }
        stage("build image") {
            steps {
                script {
                    echo "building image"
                    buildImage
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

