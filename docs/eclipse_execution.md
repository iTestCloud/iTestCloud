# Eclipse Execution

Once a test scenario has been developed, you are ready to execute the particular test scenario. You may do so in Eclipse by launching the scenario via an appropriate launch configuration as shown below.

<img src="../images/eclipse_run_dialog.png" alt="Eclipse Run Dialog" height="500"/>

Users for running the tests are typically defined in `scenario.properties`. To avoid conflicts if tests are run by two or more users at the same time, you may want to change the `TestUser` (or Admin user) to yourself. For encrypting your password safely instead of using plain text, please refer to the **Encrypt your password** section in the [Test Run Setup guide](test_run_setup.md).

For your specific project's `scenario.properties`, be sure to set properties like `organization` and `space` (or equivalent environment settings) to your personal values.

---
**Documentation Navigation:**
[Home](../README.md) | [Eclipse Setup](eclipse_setup.md) | [Browser Setup](browser_setup.md) | [Test Run Setup](test_run_setup.md) | [Eclipse Execution](eclipse_execution.md) | [Command Line Execution](cmdln_execution.md) | [Jenkins Execution](jenkins_execution.md) | [Jenkins Slave Setup](jenkins_slave_setup.md) | [Scenario Development](scenario_development.md) | [Test Scenarios](test_scenarios.md) | [Coding Style](coding_style.md) | [Javadoc Standards](javadoc_standards.md)
