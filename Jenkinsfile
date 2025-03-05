
pipeline {
    agent any

    /* environment{

    PATH = "/Users/vedantkhadkekar/Documents/software_install/apache-maven-3.9.2"
    } */
    /* agent{
         docker { image ''}
         } */

        tools {
                 maven 'maven'
             }

    stages {

         /* stage ('Initialize') {
                steps {
                    sh '''
                        echo "PATH = ${PATH}"
                        echo "M2_HOME = ${M2_HOME}"
                    '''
                }
         } */

         stage('Run Selenium Tests') {

                     steps {

                         docker.image('selenium/hub') {

                             containerLabel 'selenium-hub'

                             // Run the Selenium Hub container

                         }

                         docker.image('selenium/node-chrome') {

                             containerLabel 'selenium-chrome-node'

                             // Run the Chrome node container, linking to the Selenium Hub

                         }
                     }
         }

        stage('Build') {
            steps {
            echo 'this is for test'
             sh 'mvn clean test -Dsurefire.suiteXmlFiles=testng.xml'
            }

            /* post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                   publishHTML([
                       allowMissing: false,
                       alwaysLinkToLastBuild: false,
                       keepAll: false,
                       reportFiles: 'emailable-report.html',
                       reportName: 'HTML Report',
                       reportTitles: '',
                       useWrapperFileDirectly: true])
                }
            } */
        }
    }
}