
pipeline {
    agent any
    /* agent{
         docker { image ''}
         } */

         /* maventools {
                 maven 'Maven 3.9.9'
                 jdk 'jdk8'
             } */

    stages {
        stage('Test') {
            steps {
                sh 'clean test -Dsurefire.suiteXmlFiles=testng.xml'
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