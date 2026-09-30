def call() {
    stage('Build') {
        sh 'mvnw clean package -DskipTests'
    }

    stage('Test') {
        sh 'mvnw test'
    }

    stage('Deploy') {
        echo 'Java application deployed successfully!'
    }
}