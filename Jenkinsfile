pipeline {
    agent any

    stages {
        stage('Test Functional') {
            steps{
                bat "mvn clean -Dtest=LoginTest test"
            }
            steps{
                 bat "mvn clean -Dtest=UsuarioTest test"
            }
            steps{
                 bat "mvn clean -Dtest=FuncionarioTest test"
            }
        }
    }
}


