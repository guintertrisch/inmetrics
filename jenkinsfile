pipeline {
    agent any

    stages {
        stage('Build WEB') {
            steps {
                git 'https://github.com/guintertrisch/inmetrics.git'
            }
        }
        stage('Test Functional') {
            steps{
                bat "mvn -Dtest=FuncionarioTest test"
            }
        }

    }
}


