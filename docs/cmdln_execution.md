# 💻 Command Line Execution

Executing test scenarios from the command line enables seamless integration into custom automation scripts, headless server environments, and CI/CD pipelines.

---

### ☕ Running via Java CLI

If your test environment is fully compiled and all required libraries reside in a dependencies directory (e.g., `lib/`), you can execute the JUnit test suite directly:

```bash
java -cp "lib/*:target/classes" org.junit.runner.JUnitCore com.ibm.itest.cloud.YourTestSuite
```

> [!IMPORTANT]
> **Classpath Separators**
> Use the appropriate classpath path separator for your operating system:
> * **macOS & Linux:** Colon (`:`) &rarr; `-cp "lib/*:target/classes"`
> * **Windows:** Semicolon (`;`) &rarr; `-cp "lib/*;target/classes"`

---

### ⚙️ Passing Runtime Properties

You can customize the test execution context by passing system properties dynamically using the `-D` flag (equivalent to Eclipse VM arguments):

```bash
java -DfirstStep=G02 -DfirstTest=07 -cp "lib/*:target/classes" org.junit.runner.JUnitCore com.ibm.itest.cloud.YourTestSuite
```

---

### 🛠️ Execution via Build Tools

When the project has Maven, Gradle, or Ant build scripts defined, use the corresponding commands to execute tests:

* **Maven:**
  ```bash
  mvn clean test -Dtest=YourTestSuite -DargLine="-DfirstStep=G02"
  ```
* **Gradle:**
  ```bash
  gradle test --tests "com.ibm.itest.cloud.YourTestSuite" -DfirstStep=G02
  ```
* **Ant:**
  ```bash
  ant test -DfirstStep=G02
  ```

---

### 🌐 Documentation Navigation

| 🚀 Getting Started | 🛠️ Configuration & Setup | 💻 Execution | 📚 reference: Reference |
| :--- | :--- | :--- | :--- |
| [🏠 Home](../README.md) | [🌙 Eclipse Setup](eclipse_setup.md) | [⚡ From Eclipse](eclipse_execution.md) | [📝 Scenario Development](scenario_development.md) |
| | [🌐 Browser Setup](browser_setup.md) | [💻 Command Line](cmdln_execution.md) | [📋 Test Scenarios](test_scenarios.md) |
| | [🔑 Test Run Setup](test_run_setup.md) | [⚙️ Jenkins CI](jenkins_execution.md) | [🎨 Coding Style](coding_style.md) |
| | [🤖 Jenkins Slave Setup](jenkins_slave_setup.md) | | [📖 Javadoc Standards](javadoc_standards.md) \| [📄 License](../LICENSE) |

