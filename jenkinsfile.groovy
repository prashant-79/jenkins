pipeline {
    agent any
    stages {
        stage('Submit Stack') {
            steps {
            bat 'aws cloudformation --stack-name ec2stack --template-body file://ec2_cf_template1.json --region ap-south-1 --parameters ParameterKey=KeyPairName,ParameterValue=mykey'
              }
             }
            }
            }
