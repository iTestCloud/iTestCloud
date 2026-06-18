# 📝 Test Scenario Development

Follow this step-by-step workflow to develop, structure, and submit a new test scenario using the iTestCloud framework.

---

### 📦 Phase 1: Repository & Work Setup

1. **Request Repository Provisioning:**
   Contact an iTestCloud project administrator to provision a dedicated repository for your new test scenario within the organization.
2. **Clone Core Framework Layers:**
   Clone the following core framework repositories onto your local machine:
   * **Common Layer:** `https://<git-server>/iTestCloud/com.ibm.itest.cloud.common`
   * **Portal Layer:** `https://<git-server>/iTestCloud/com.ibm.itest.cloud.apsportal`
   * **Demo Scenario:** `https://<git-server>/iTestCloud/com.ibm.itest.cloud.apsportal.demo`
3. **Task Tracking:**
   Create an issue in the planning repository to track the lifecycle of your test scenario.
4. **Clone Scenario Repository:**
   Clone your newly provisioned test scenario repository onto your computer.

---

### 🌿 Phase 2: Branching & IDE Setup

5. **Branch Creation:**
   Create a new branch in your test scenario repository using the following format:
   ```bash
   git checkout -b <your_id>_<issue_id>
   # Example: git checkout -b jdoe_39
   ```
6. **Import Projects to Eclipse:**
   Import all cloned repositories into your configured Eclipse IDE workspace as existing projects.
7. **Verify Active Branch:**
   Confirm that your newly created branch is checked out and active for your scenario project in Eclipse.

---

### 💻 Phase 3: Scenario Implementation & Refactoring

8. **Bootstrap from Demo Scenario:**
   Copy the contents of the template project (`com.ibm.itest.cloud.apsportal.demo`) into your test scenario project folder.
9. **Refactor Codebase:**
   Rename and refactor packages, classes, variables, and Javadocs within your new project to match the target application and test goals.
10. **Commit Boilerplate:**
    Commit your initial refactored project template structure to your remote branch.
11. **Write Test Cases:**
    Develop test cases within the test scenario project, adhering to the project's [Coding Standards](coding_style.md) and [Javadoc Standards](javadoc_standards.md).

---

### 🚀 Phase 4: Code Review & Merging

12. **Submit Pull Request:**
    Commit and push your completed test cases to your remote branch, then open a Pull Request (PR).
13. **Code Review:**
    Request a review from a project administrator/maintainer.
14. **Integration:**
    Upon successful review and green validation runs, the administrator will merge your changes into the `main` branch.

---

### 🌐 Documentation Navigation

| 🚀 Getting Started | 🛠️ Configuration & Setup | 💻 Execution | 📚 reference: Reference |
| :--- | :--- | :--- | :--- |
| [🏠 Home](../README.md) | [🌙 Eclipse Setup](eclipse_setup.md) | [⚡ From Eclipse](eclipse_execution.md) | [📝 Scenario Development](scenario_development.md) |
| | [🌐 Browser Setup](browser_setup.md) | [💻 Command Line](cmdln_execution.md) | [📋 Test Scenarios](test_scenarios.md) |
| | [🔑 Test Run Setup](test_run_setup.md) | [⚙️ Jenkins CI](jenkins_execution.md) | [🎨 Coding Style](coding_style.md) |
| | [🤖 Jenkins Slave Setup](jenkins_slave_setup.md) | | [📖 Javadoc Standards](javadoc_standards.md) \| [📄 License](../LICENSE) |

