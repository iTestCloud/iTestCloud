# 🤖 Jenkins Slave/Agent Setup

Setting up a dedicated Jenkins slave (agent) ensures consistent test execution environments with controlled browser, driver, and OS dependencies. Follow this step-by-step guide to configure a new agent node.

---

### 🌐 Node Configuration in Jenkins

1. **Deploy the Virtual Machine:** 
   Deploy a Linux VM (e.g., Red Hat Enterprise Linux (RHEL), Ubuntu Server) in your infrastructure.
2. **Add Node in Jenkins:**
   Go to **Manage Jenkins > Nodes**, click **New Node**, and specify a name. If you have an existing template node, choose **Copy Existing Item**.
3. **Configure Settings & Environment Variables:**
   Set the following fields in the Node configuration page:

   | Configuration Parameter | Target Value |
   | :--- | :--- |
   | **Host** | Hostname or IP address of the newly deployed VM |
   | **Remote root directory** | `/home/automation/jenkins` |
   | **Environment Variable: `CHROME_DRIVER`** | `/opt/drivers/chromedriver` |
   | **Environment Variable: `FF_DRIVER`** | `/opt/drivers/geckodriver` |
   | **Environment Variable: `FF_PATH`** | `/opt/firefox/firefox` |

---

### ⚙️ Provisioning the Agent VM

4. **Retrieve Agent Secret:**
   Once saved, open the node page in Jenkins. Under **Launch agent by connecting it to the controller** (or **Run from agent command line**), locate the startup command:
   ```bash
   java -jar agent.jar -jnlpUrl https://<jenkins-url>/computer/<vm-name>/slave-agent.jnlp -secret XXXXXXXXXXX -workDir "/home/automation/jenkins"
   ```
   > [!IMPORTANT]
   > Copy the long alphanumeric string representing the `-secret` parameter (`XXXXXXXXXXX`) and save it securely.

5. **Install System Prerequisites:**
   Run your infrastructure setup scripts (e.g., `root_setup.sh`, `user_setup.sh`) if provided by your team's deployment repository.
6. **Configure Automation User:**
   Ensure a dedicated local user account (e.g., `automation`) exists on the VM to run Jenkins tasks. If prompted by setup scripts, provide the VM hostname and the secret code copied in Step 4.
7. **Configure Headless Execution Display:**
   Login to the VM as the `automation` user and configure **VNC** or **Xvfb** (X Virtual Frame Buffer) to allow browsers to run headlessly. Record any display passwords generated.

---

### 🔍 Version Verification & Verification

8. **Verify Browser & Driver Alignment:**
   Ensure your drivers match your installed browser versions exactly to prevent connection faults.
   * **Verify Chrome Driver:**
     ```bash
     /opt/drivers/chromedriver --version
     ```
   * **Verify Chrome Browser:**
     ```bash
     /opt/google/chrome/chrome --version
     ```
   > [!TIP]
   > Reference the [Chrome Driver Downloads page](https://chromedriver.chromium.org/downloads) to identify matching driver and browser version matrices. Update your drivers on the VM if they do not align.

9. **Verify Connection:**
   Start the agent process on the VM. Return to the Jenkins server dashboard, navigate to the Nodes list, and verify that the newly added agent is **Online** and active.

---

### 🌐 Documentation Navigation

| 🚀 Getting Started | 🛠️ Configuration & Setup | 💻 Execution | 📚 reference: Reference |
| :--- | :--- | :--- | :--- |
| [🏠 Home](../README.md) | [🌙 Eclipse Setup](eclipse_setup.md) | [⚡ From Eclipse](eclipse_execution.md) | [📝 Scenario Development](scenario_development.md) |
| | [🌐 Browser Setup](browser_setup.md) | [💻 Command Line](cmdln_execution.md) | [📋 Test Scenarios](test_scenarios.md) |
| | [🔑 Test Run Setup](test_run_setup.md) | [⚙️ Jenkins CI](jenkins_execution.md) | [🎨 Coding Style](coding_style.md) |
| | [🤖 Jenkins Slave Setup](jenkins_slave_setup.md) | | [📖 Javadoc Standards](javadoc_standards.md) \| [📄 License](../LICENSE) |

