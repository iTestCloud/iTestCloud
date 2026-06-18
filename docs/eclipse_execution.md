# ⚡ Eclipse Execution

Once you have developed a test scenario, you can execute it within Eclipse by launching the scenario using the corresponding JUnit launch configuration.

---

### 🖥️ Launching Tests

Open the **Run Configurations** or **Debug Configurations** dialog in Eclipse, locate your JUnit configuration, and click **Run**:

<div align="center">
  <img src="../images/eclipse_run_dialog.png" alt="Eclipse Run Dialog" height="420" style="border-radius: 8px; box-shadow: 0 4px 12px rgba(0,0,0,0.15);" />
</div>

---

### 🔑 User Configuration

Users for executing the test suites are typically defined in `scenario.properties`. 

> [!TIP]
> **Avoid Resource Conflicts**
> If multiple developers run tests simultaneously against the same environment, change the `TestUser` (or `Admin` user) to your own user account.
> 
> * For encrypting your password safely (rather than storing it in plain text), see the **Encrypt your password** section in the [Test Run Setup guide](test_run_setup.md).
> * In your specific project's `scenario.properties`, ensure you configure parameters like `organization` and `space` (or equivalent target cloud environment properties) to your personal namespace.

---

### 🌐 Documentation Navigation

| 🚀 Getting Started | 🛠️ Configuration & Setup | 💻 Execution | 📚 reference: Reference |
| :--- | :--- | :--- | :--- |
| [🏠 Home](../README.md) | [🌙 Eclipse Setup](eclipse_setup.md) | [⚡ From Eclipse](eclipse_execution.md) | [📝 Scenario Development](scenario_development.md) |
| | [🌐 Browser Setup](browser_setup.md) | [💻 Command Line](cmdln_execution.md) | [📋 Test Scenarios](test_scenarios.md) |
| | [🔑 Test Run Setup](test_run_setup.md) | [⚙️ Jenkins CI](jenkins_execution.md) | [🎨 Coding Style](coding_style.md) |
| | [🤖 Jenkins Slave Setup](jenkins_slave_setup.md) | | [📖 Javadoc Standards](javadoc_standards.md) \| [📄 License](../LICENSE) |

