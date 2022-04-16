pipeline{

	agent any

	environment{
		DOCKERHUB_CREDENTIALS=credentials('Jenkins_Docker')
	}
	
	stages{
		stage('Git Pull')
		{
			steps{
				git 'https://github.com/praveenreddychalamalla/DevOpsCalculator.git'
			}
		}
		stage('Maven Build')
		{
			steps{
				sh 'mvn clean'
				sh 'mvn test'
				sh 'mvn install'
			}
		}
		stage('Docker Image Creation')
		{
			steps{
			    echo 'docker tag'
				sh 'docker build . -t 9542289925/calculator_app'
				echo 'docker login'
				sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
				echo 'Pushing image to docker hub'
				sh 'docker push 9542289925/calculator_app'
				echo 'docker logout'
				sh 'docker logout'
			}
		}
		stage('Ansible Deploy'){
			steps{
				sh 'ansible-playbook playbook.yml -i inventory'
			}
		}

	}	
}
