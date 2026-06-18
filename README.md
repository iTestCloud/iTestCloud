# 🌐 iTestCloud

<div align="center">

[![Java Version](https://img.shields.io/badge/Java-21-blue.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://adoptium.net/)
[![Selenium](https://img.shields.io/badge/Selenium-4-green.svg?style=for-the-badge&logo=selenium&logoColor=white)](https://www.selenium.dev/)
[![JUnit 5](https://img.shields.io/badge/JUnit-5-red.svg?style=for-the-badge&logo=junit5&logoColor=white)](https://junit.org/junit5/)
[![License](https://img.shields.io/badge/License-Apache_2.0-orange.svg?style=for-the-badge)](LICENSE)

**A powerful, extensible automation framework for developing robust UI tests.**

</div>

---

## 🚀 Overview

**iTestCloud** provides high-level building blocks for developing robust, scalable automated UI tests for web applications. By wrapping and extending open-source standards like **Selenium** and **JUnit**, iTestCloud makes test development clean, maintainable, and highly reliable.

### 🌟 Key Strengths
* **Broad Compatibility:** Works seamlessly with all major modern web technologies (such as React, Angular, Vue) and modern web browsers (Chrome, Firefox, Edge, Safari).
* **Cross-Platform support:** Runs on Windows, macOS, Linux, Unix, and mobile/hybrid environments.
* **Continuous Integration Ready:** Out-of-the-box support for execution via Jenkins, Travis CI, CLI, and Eclipse.
* **Proven Scale:** Powering over **1,700 fully automated tests** validating features across complex projects like Cloud Pak for Data (CPD).
* **Extensive Documentation:** Clean APIs, inline JavaDoc comments, and comprehensive reference standards.

---

## 🏛️ Architecture

Below is the high-level architecture of the iTestCloud framework, showing the layers between tests, standard pages, common layers, and the underlying browser engines.

<div align="center">
  <img src="images/architecture.png" alt="iTestCloud Architecture" height="320" style="border-radius: 8px; box-shadow: 0 4px 12px rgba(0,0,0,0.15);" />
</div>

---

## 📂 Project Structure & Repositories

1. **Core Distribution:** The framework is developed and distributed via the [iTestCloud Repository](https://github.com/IBM/iTestCloud).
2. **Issue Tracking:** We track active development, bug fixes, and feature requests directly in the [iTestCloud Issues tracker](https://github.com/IBM/iTestCloud/issues).

---

## 📖 Quick Links & Resources

### 🎓 Educational Materials
* [iTestCloud Slide Presentation (PPTX)](artifacts/iTestCloud.pptx)
* [Coding Standards Guide](docs/coding_style.md)
* [Javadoc Standards Guide](docs/javadoc_standards.md)

### 🛠️ Configuration & Setup
1. [Eclipse IDE Setup](docs/eclipse_setup.md)
2. [Web Browser Setup](docs/browser_setup.md)
3. [Jenkins Agent/Slave Setup](docs/jenkins_slave_setup.md) *(Optional)*

### 📝 Test Development & Runs
* [How to Develop Test Scenarios](docs/scenario_development.md)
* [Configuring Personal Accounts for Test Runs](docs/test_run_setup.md)

### ⚡ Test Execution
* [Execution from Eclipse IDE](docs/eclipse_execution.md)
* [Execution from Command Line Interface](docs/cmdln_execution.md)
* [Execution via Jenkins CI](docs/jenkins_execution.md)

---

## ⚠️ Disclaimer & Limitation of Liability

> [!WARNING]
> **Use at Your Own Risk**
> This project is licensed under the **Apache License 2.0**. By using, reproducing, or distributing this code or any part of it, you acknowledge and agree that it is provided on an **"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND**, either express or implied.
> 
> The authors and contributors **DENY ALL LIABILITY** for any damages, including direct, indirect, special, incidental, or consequential damages, arising out of the use or inability to use this software. For full details, please refer to the [LICENSE](LICENSE) file.

---

### 🌐 Documentation Navigation

| 🚀 Getting Started | 🛠️ Configuration & Setup | 💻 Execution | 📚 reference: Reference |
| :--- | :--- | :--- | :--- |
| [🏠 Home](README.md) | [🌙 Eclipse Setup](docs/eclipse_setup.md) | [⚡ From Eclipse](docs/eclipse_execution.md) | [📝 Scenario Development](docs/scenario_development.md) |
| | [🌐 Browser Setup](docs/browser_setup.md) | [💻 Command Line](docs/cmdln_execution.md) | [📋 Test Scenarios](docs/test_scenarios.md) |
| | [🔑 Test Run Setup](docs/test_run_setup.md) | [⚙️ Jenkins CI](docs/jenkins_execution.md) | [🎨 Coding Style](docs/coding_style.md) |
| | [🤖 Jenkins Slave Setup](docs/jenkins_slave_setup.md) | | [📖 Javadoc Standards](docs/javadoc_standards.md) \| [📄 License](LICENSE) |

