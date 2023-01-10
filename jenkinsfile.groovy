pipeline {
    agent any
    stages {
        stage('Submit Stack') {
            steps {
<<<<<<< HEAD
            sh 'aws cloudformation --stack-name ec2stack --template-body file://ec2_cf_template1.json --region ap-south-1 --parameters ParameterKey=KeyPairName,ParameterValue=mykey'
=======
            bat 'aws cloudformation create-stack --stack-name ec2stack --template-body file://ec2_cf_template1.json --region ap-south-1'
>>>>>>> 616b5ae (4th)
              }
             }
            }
            }
