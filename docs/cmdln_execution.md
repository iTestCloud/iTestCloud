# Command Line Execution

Executing tests from the command line allows for integration into CI/CD pipelines or headless server environments. 

## Using Standard Java Command

If your test environment is fully compiled and all dependencies are available in a directory (e.g., `lib/`), you can execute the JUnit test runner directly:

```bash
java -cp "lib/*:target/classes" org.junit.runner.JUnitCore com.ibm.itest.cloud.YourTestSuite
```

*Note: The classpath separator is `:` on Unix/Linux/macOS and `;` on Windows.*

## Passing System Properties

When running via command line, you can pass the same properties used in Eclipse VM arguments by using the `-D` flag:

```bash
java -DfirstStep=G02 -DfirstTest=07 -cp "lib/*:target/classes" org.junit.runner.JUnitCore com.ibm.itest.cloud.YourTestSuite
```

## Build Automation Tools

If the project is later configured with a build tool like **Maven**, **Gradle**, or **Ant**, you can execute tests as follows:

- **Maven:** `mvn clean test -Dtest=YourTestSuite -DargLine="-DfirstStep=G02"`
- **Gradle:** `gradle test --tests "com.ibm.itest.cloud.YourTestSuite" -DfirstStep=G02`
- **Ant:** Provide the target defined in your `build.xml`, e.g., `ant test`

---
**Documentation Navigation:**
[Home](../README.md) | [Eclipse Setup](eclipse_setup.md) | [Browser Setup](browser_setup.md) | [Test Run Setup](test_run_setup.md) | [Eclipse Execution](eclipse_execution.md) | [Command Line Execution](cmdln_execution.md) | [Jenkins Execution](jenkins_execution.md) | [Jenkins Slave Setup](jenkins_slave_setup.md) | [Scenario Development](scenario_development.md) | [Test Scenarios](test_scenarios.md) | [Coding Style](coding_style.md) | [Javadoc Standards](javadoc_standards.md) | [License](../LICENSE)
