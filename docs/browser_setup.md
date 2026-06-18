# 🌐 Browser Setup

The iTestCloud framework supports all major web browsers. Comprehensive compatibility verification is routinely run against **Google Chrome** and **Mozilla Firefox**.

---

### 🌐 Google Chrome

Please complete the following steps to configure Google Chrome for developing and/or executing tests:

1. Check the version of Chrome running on your system.
2. Download the Chrome Driver matching the version of Chrome from [Chrome Driver Downloads](https://chromedriver.chromium.org/downloads).
3. Extract the downloaded Chrome Driver executable to your local drivers directory:
   * **Windows:** `C:\itestcloud\drivers\`
   * **macOS/Linux:** `/Users/Shared/itestcloud/drivers/`
4. Create a profiles directory to host Chrome runtime files:
   * **Windows:** `C:\itestcloud\profiles\chrome\`
   * **macOS/Linux:** `/Users/Shared/itestcloud/profiles/chrome/`
5. In your project's browser properties file (e.g., `params/browser/chrome.properties`), configure the following properties:
   * `browserDriver`: Path to the driver executable.
   * `browserProfile`: Path to the profiles directory.

> [!TIP]
> **macOS Security Gatekeeper Warning**
> If you encounter an "Apple can’t check app for malicious software" error on macOS when starting `chromedriver`:
> Control-click the `chromedriver` executable in Finder, choose **Open** from the shortcut menu, and approve running it.

---

### 🦊 Mozilla Firefox

Please complete the following steps to configure Firefox for developing and/or executing tests:

1. Download and install the latest ESR or stable version of [Firefox](https://www.mozilla.org/en-US/firefox/new/).
2. Download the latest [Gecko Driver Release](https://github.com/mozilla/geckodriver/releases).
3. Extract the downloaded Gecko Driver to your drivers directory (e.g., `C:\itestcloud\drivers\` or `/Users/Shared/itestcloud/drivers/`).
4. Update your project's browser properties file `params/browser/firefox.properties`:
   * `browserPath`: Path to the Firefox executable (if installed in a custom location).
   * `browserDriver`: Path to the Gecko Driver.
   * `browserProfile`: Path to the profiles directory.

---

### 🌀 Microsoft Edge

Please complete the following steps to configure Microsoft Edge:

1. Check the version of Microsoft Edge running on your system.
2. Download the matching Edge WebDriver from the [Microsoft Edge Developer site](https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/).
3. Extract the downloaded `msedgedriver` executable to your drivers directory.
4. Update your project's `params/browser/edge.properties` file with the correct `browserDriver` path.

---

### 🧭 Apple Safari

Safari provides native WebDriver support under macOS. Complete the following setup:

1. Enable the Develop menu in Safari: Go to **Safari > Settings > Advanced** and check **"Show features for web developers"** (or **"Show Develop menu in menu bar"** on older versions).
2. Allow automation: Open the **Develop** menu and check **"Allow Remote Automation"**.
3. *Note: No driver download is required. The `safaridriver` executable is pre-installed with macOS.*
4. Update your project's `params/browser/safari.properties` parameters if specific customizations are needed.

---

### 🌐 Documentation Navigation

| 🚀 Getting Started | 🛠️ Configuration & Setup | 💻 Execution | 📚 reference: Reference |
| :--- | :--- | :--- | :--- |
| [🏠 Home](../README.md) | [🌙 Eclipse Setup](eclipse_setup.md) | [⚡ From Eclipse](eclipse_execution.md) | [📝 Scenario Development](scenario_development.md) |
| | [🌐 Browser Setup](browser_setup.md) | [💻 Command Line](cmdln_execution.md) | [📋 Test Scenarios](test_scenarios.md) |
| | [🔑 Test Run Setup](test_run_setup.md) | [⚙️ Jenkins CI](jenkins_execution.md) | [🎨 Coding Style](coding_style.md) |
| | [🤖 Jenkins Slave Setup](jenkins_slave_setup.md) | | [📖 Javadoc Standards](javadoc_standards.md) \| [📄 License](../LICENSE) |

