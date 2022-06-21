pipeline{
    agent any
  environment {
        JIRA_TAGS = ''
        JIRA_BUGS = ''
        JIRASERVER = 'Jira Connect'
        BROWSERSTACK_USERNAME = "env.BROWSERSTACK_USERNAME"
        BROWSERSTACK_ACCESS_KEY = "env.BROWSERSTACK_ACCESS_KEY"
   }
    stages
    {
      stage("Run Test en BrowserStack"){
          steps{
            echo env.BROWSERSTACK_USERNAME
              browserstack('b5df719e-877d-4cab-95c4-54e32b6574ba') {
              withGradle{
                     sh "/var/jenkins_home/tools/hudson.plugins.gradle.GradleInstallation/TestBrowserStack/bin/gradle clean test"
                     }
                    browserStackReportPublisher 'automate'
              }
          }
      }

    }
}



