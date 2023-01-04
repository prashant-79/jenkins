pipeline {
    agent any
    stages {
        stage('Submit Stack') {
            steps {
            sh "aws cloudformation create-stack --stack-name ec2stack --template-body file://ec2_cf_template1.json --region 'ap-south-1'"
              }
             }
            }
            }