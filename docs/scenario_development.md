# Scenario Development

Once your IDE and browser have been configured, you are ready to develop a test scenario as described below. 

1. Contact an administrator of the iTestCloud project to provision a repository for your new test scenario within the project's organization.
2. Clone the following core framework repositories onto your computer (if applicable to your project):
   - **Common Layer:** `https://<git-server>/iTestCloud/com.ibm.itest.cloud.common`
   - **Portal Layer:** `https://<git-server>/iTestCloud/com.ibm.itest.cloud.apsportal`
   - **Demo Scenario:** `https://<git-server>/iTestCloud/com.ibm.itest.cloud.apsportal.demo`
3. Create a new issue in the Planning Repository to track the development of your test scenario.
4. Create a new branch in your test scenario repository with a name in the following format: `<your_id>_<issue_id>`. For example, **jdoe_39**.
5. Clone the repository created for your new test scenario onto your computer.
6. Switch to the newly created branch in your test scenario repository.
7. Import all above mentioned repositories into Eclipse as existing projects.
8. Ensure that the new branch has been selected for your test scenario repository/project in Eclipse.
9. Copy the contents of the demo test scenario project (e.g., `com.ibm.itest.cloud.apsportal.demo`) into your test scenario project to use as a template.
10. Refactor the copied contents (such as Java packages, classes, comments, etc.) in your new test scenario project appropriately.
11. Commit your initial changes to the new branch.
12. Develop new test-cases in the new test scenario project.
13. Once your test cases have been developed, commit your changes to the new branch, create a pull request, and ask an administrator to review your changes.
14. The administrator will merge your changes to the main branch of your test scenario repository upon the completion of the review.

---
**Documentation Navigation:**
[Home](../README.md) | [Eclipse Setup](eclipse_setup.md) | [Browser Setup](browser_setup.md) | [Test Run Setup](test_run_setup.md) | [Eclipse Execution](eclipse_execution.md) | [Command Line Execution](cmdln_execution.md) | [Jenkins Execution](jenkins_execution.md) | [Jenkins Slave Setup](jenkins_slave_setup.md) | [Scenario Development](scenario_development.md) | [Test Scenarios](test_scenarios.md) | [Coding Style](coding_style.md) | [Javadoc Standards](javadoc_standards.md)
