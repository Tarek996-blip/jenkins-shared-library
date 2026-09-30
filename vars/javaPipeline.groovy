def call() {
    stage('Build') {
        sh 'mvn clean package -DskipTests'
    }

    stage('Test') {
        sh 'mvn test'
    }

    stage('Deploy') {
        echo 'Java application deployed successfully!'
    }
}