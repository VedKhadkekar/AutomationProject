
pipeline {
    agent any
    /* agent{
         docker { image ''}
         } */

        /*  tools {
                 maven 'Maven 3.9.9'
                 jdk 'jdk11'
             } */

    stages {

         /* stage ('Initialize') {
                steps {
                    sh '''
                        echo "PATH = ${PATH}"
                        echo "M2_HOME = ${M2_HOME}"
                    '''
                }
         } */

        stage('Build') {
            steps {
            echo 'this is for test'
                sh "mvn clean test"
            }

            /* post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                   publishHTML([
                       allowMissing: false,
                       alwaysLinkToLastBuild: false,
                       keepAll: false,
                       reportDir: 'target/surefire-reports/',
                       reportFiles: 'emailable-report.html',
                       reportName: 'HTML Report',
                       reportTitles: '',
                       useWrapperFileDirectly: true])
                }
            } */
        }
    }
}