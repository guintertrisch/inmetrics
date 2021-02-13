pipeline {
    agent any

    stages {
        stage('Test Functional') {
            steps{
                bat "mvn clean -Dtest=LoginTest test"
                bat "mvn clean -Dtest=UsuarioTest test"
                bat "mvn clean -Dtest=FuncionarioTest test"
            }
        }
    }
}


