# Eclipse Setup
Please complete the following steps to setup and configure Eclipse for developing automated UI tests using the iTestCloud framework. 

1. Download and install the latest Java SDK or JRE 21 from a standard distribution (e.g., [Eclipse Adoptium](https://adoptium.net/)). If you are within a corporate environment, use your organization's approved software center. 
2. Download and install [Eclipse 2025-03 R IDE for Eclipse Committers](https://www.eclipse.org/downloads/packages/release/2025-03/r/eclipse-ide-eclipse-committers).
3. Start Eclipse into a new dedicated workspace for iTestCloud related work.
4. Open the [iTestCloud preferences](../artifacts/preferences.epf) link, click on the `Raw` button, and save the file into a directory in the local file system by selecting `File -> Save As...` from the menu of the browser.
5. Import the downloaded preferences file into Eclipse by selecting "File -> Import... -> General -> Preferences". Make sure to import all preferences from the file.
6. Open the **Installed JREs Tab** of the **Preferences Dialog**. The Java SDK or JRE 21 should have already been recognized as an installed JRE in this tab.
   <img src="../images/installed_jres_tab.png" alt="Installed JREs Tab" height="400"/>
7. Open the **Compiler Tab** of the **Preferences Dialog** and select **21** as the **Compiler compliance level**.
   <img src="../images/compiler_tab.png" alt="Compiler Tab" height="400"/>
8. Save all the changes and close the **Preferences Dialog**.

---
**Documentation Navigation:**
[Home](../README.md) | [Eclipse Setup](eclipse_setup.md) | [Browser Setup](browser_setup.md) | [Test Run Setup](test_run_setup.md) | [Eclipse Execution](eclipse_execution.md) | [Command Line Execution](cmdln_execution.md) | [Jenkins Execution](jenkins_execution.md) | [Jenkins Slave Setup](jenkins_slave_setup.md) | [Scenario Development](scenario_development.md) | [Test Scenarios](test_scenarios.md) | [Coding Style](coding_style.md) | [Javadoc Standards](javadoc_standards.md)