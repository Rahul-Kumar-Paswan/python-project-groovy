def check() {
    echo "building the application..."
} 

def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-credentials', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
<<<<<<< HEAD
        sh 'docker build -t rahulkumarpaswan/python-demo:1.0 .'
=======
        sh 'docker build -t python-demo:1.0 .'
>>>>>>> feature1
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push rahulkumarpaswan/python-demo:1.0'
    }
} 

def deployApp() {
    echo 'deploying the application...'
<<<<<<< HEAD
    def dockerCmd = 'docker run -d --name rahul-project -p 3000:3000 rahulkumarpaswan/my-python-project:1.2'
    sshagent(['ec2-user-Rahul']) {
    sh "ssh -o StrictHostKeyChecking=no ec2-user@13.232.90.226 ${dockerCmd}"
    }
=======
>>>>>>> feature1
} 

return this

<<<<<<< HEAD
//

=======
//
>>>>>>> feature1
