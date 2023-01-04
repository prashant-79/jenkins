pipeline {
    agent any
    stages {
        stage('Submit Stack') {
            steps {
            bat 'stack-name=ec2stack'
            bat 'template-body= file://ec2_cf_template1.json'
            bat'region=ap-south-1'
              }
             }
            }
            }
