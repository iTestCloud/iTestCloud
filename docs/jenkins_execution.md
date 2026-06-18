# ⚙️ Jenkins CI/CD Execution

Executing test scenarios via Jenkins enables automated, scheduled runs and feedback loops on pull requests or nightly builds.

---

### 📜 Pipeline Integration (`Jenkinsfile`)

We recommend using Jenkins Declarative Pipelines. Store a `Jenkinsfile` at the root of your test scenario repository to define execution steps, environment configurations, and post-build test reporting:

```groovy
pipeline {
    agent { label 'ui-test-node' }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Execute UI Tests') {
            steps {
                // Adjust classpath separators for the target build environment
                sh 'java -cp "lib/*:target/classes" org.junit.runner.JUnitCore com.ibm.itest.cloud.YourTestSuite'
            }
        }
    }
    post {
        always {
            // Publish test outcomes in Jenkins UI
            junit 'target/surefire-reports/*.xml'
        }
    }
}
```

---

### 🛠️ Freestyle Project Setup

Alternatively, you can set up a traditional Freestyle job by completing the following:

1. **Create Item:** Click **New Item** &rarr; Select **Freestyle project** &rarr; Input a descriptive name.
2. **SCM configuration:** Under **Source Code Management**, select **Git** and point to your repository.
3. **Target Node:** Under **General**, check **Restrict where this project can be run** and specify a node configured with the required browsers (see [Jenkins Slave Setup](jenkins_slave_setup.md)).
4. **Build Step:** Add a build step matching your setup (e.g., **Execute shell**, **Execute Windows batch command**, or **Invoke top-level Maven targets**).
5. **Command Line:** Input the execution script (as detailed in the [Command Line Execution](cmdln_execution.md) guide).
6. **Publish Results:** Add a post-build action **Publish JUnit test result report** and specify your XML reports directory.
7. **Run:** Click **Build Now** to test your setup.

---

### 🌐 Documentation Navigation

| 🚀 Getting Started | 🛠️ Configuration & Setup | 💻 Execution | 📚 reference: Reference |
| :--- | :--- | :--- | :--- |
| [🏠 Home](../README.md) | [🌙 Eclipse Setup](eclipse_setup.md) | [⚡ From Eclipse](eclipse_execution.md) | [📝 Scenario Development](scenario_development.md) |
| | [🌐 Browser Setup](browser_setup.md) | [💻 Command Line](cmdln_execution.md) | [📋 Test Scenarios](test_scenarios.md) |
| | [🔑 Test Run Setup](test_run_setup.md) | [⚙️ Jenkins CI](jenkins_execution.md) | [🎨 Coding Style](coding_style.md) |
| | [🤖 Jenkins Slave Setup](jenkins_slave_setup.md) | | [📖 Javadoc Standards](javadoc_standards.md) \| [📄 License](../LICENSE) |

