# 🌙 Eclipse Setup

Follow these steps to set up and configure your Eclipse IDE for developing automated UI tests using the iTestCloud framework.

---

### 📥 Prerequisites & Installation

1. **Install Java 21 SDK:**
   Download and install Java SDK or JRE 21 from a standard distribution like [Adoptium (Temurin)](https://adoptium.net/).
   > [!NOTE]
   > If you are working in a corporate environment, obtain Java 21 from your organization's approved software repository.

2. **Install Eclipse IDE:**
   Download and install [Eclipse 2025-03 R IDE for Eclipse Committers](https://www.eclipse.org/downloads/packages/release/2025-03/r/eclipse-ide-eclipse-committers).

3. **Workspace Initialization:**
   Start Eclipse and create a new dedicated workspace (e.g., `workspace-itestcloud`) to keep your workspace configurations clean.

---

### ⚙️ Workspace Configuration

4. **Get Preference Profile:**
   Download the unified [iTestCloud Preferences Profile](../artifacts/preferences.epf). Click the **Raw** button on GitHub and select **File > Save Page As...** to save the file locally.

5. **Import Preferences:**
   In Eclipse, select **File > Import... > General > Preferences**, choose your downloaded `.epf` file, check **Import all**, and click **Finish**.

6. **Verify Java Runtime Environment (JRE):**
   Navigate to **Window > Preferences > Java > Installed JREs**. Ensure that the Java SDK/JRE 21 is recognized and checked.
   
   <div align="center">
     <img src="../images/installed_jres_tab.png" alt="Installed JREs Tab" height="360" style="border-radius: 8px; box-shadow: 0 4px 12px rgba(0,0,0,0.15);" />
   </div>

7. **Verify Compiler Compliance Level:**
   Navigate to **Window > Preferences > Java > Compiler**. Set the **Compiler compliance level** to **21**.

   <div align="center">
     <img src="../images/compiler_tab.png" alt="Compiler Tab" height="360" style="border-radius: 8px; box-shadow: 0 4px 12px rgba(0,0,0,0.15);" />
   </div>

8. **Save Changes:**
   Click **Apply and Close** to finalize your workspace settings.

---

### 🌐 Documentation Navigation

| 🚀 Getting Started | 🛠️ Configuration & Setup | 💻 Execution | 📚 reference: Reference |
| :--- | :--- | :--- | :--- |
| [🏠 Home](../README.md) | [🌙 Eclipse Setup](eclipse_setup.md) | [⚡ From Eclipse](eclipse_execution.md) | [📝 Scenario Development](scenario_development.md) |
| | [🌐 Browser Setup](browser_setup.md) | [💻 Command Line](cmdln_execution.md) | [📋 Test Scenarios](test_scenarios.md) |
| | [🔑 Test Run Setup](test_run_setup.md) | [⚙️ Jenkins CI](jenkins_execution.md) | [🎨 Coding Style](coding_style.md) |
| | [🤖 Jenkins Slave Setup](jenkins_slave_setup.md) | | [📖 Javadoc Standards](javadoc_standards.md) \| [📄 License](../LICENSE) |