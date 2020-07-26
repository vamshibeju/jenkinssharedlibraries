def call() {
    sh "mvn clean install "
    sh "mvn sonar:sonar"
}
