pipeline {
    agent any
    stages {
        stage('Submit Stack') {
            steps {
            bat 'cfn-create-or-update --stack-name ec2stack --template-body file://ec2_cf_template1.json --region ap-south-1'
              }
             }
            }
            }
