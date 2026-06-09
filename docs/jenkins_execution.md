# Jenkins Execution

Once a test scenario has been developed, you are ready to execute the particular test scenario via Jenkins. You may do so as described below.

## Pipeline Integration (Jenkinsfile)

The most robust way to execute tests is by creating a `Jenkinsfile` in your repository and setting up a Pipeline job in Jenkins. Example snippet:

```groovy
pipeline {
    agent { label 'ui-test-node' }
    stages {
        stage('Test') {
            steps {
                sh 'java -cp "lib/*:target/classes" org.junit.runner.JUnitCore com.ibm.itest.cloud.YourTestSuite'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}
```

## Freestyle Project Setup

Alternatively, you can set up a traditional Freestyle job:

1. In Jenkins, select **New Item** -> **Freestyle project**.
2. Under **Source Code Management**, point to your Git repository containing the tests.
3. Under **Build Environment**, ensure the correct Java and browser versions are available (or utilize a specialized Jenkins slave node).
4. Add a **Build Step** (e.g., *Execute shell* or *Invoke top-level Maven targets*).
5. Input your test command (similar to the ones detailed in the [Command Line Execution](cmdln_execution.md) guide).
6. Save and click **Build Now**.

---
**Documentation Navigation:**
[Home](../README.md) | [Eclipse Setup](eclipse_setup.md) | [Browser Setup](browser_setup.md) | [Test Run Setup](test_run_setup.md) | [Eclipse Execution](eclipse_execution.md) | [Command Line Execution](cmdln_execution.md) | [Jenkins Execution](jenkins_execution.md) | [Jenkins Slave Setup](jenkins_slave_setup.md) | [Scenario Development](scenario_development.md) | [Test Scenarios](test_scenarios.md) | [Coding Style](coding_style.md) | [Javadoc Standards](javadoc_standards.md) | [License](../LICENSE)
