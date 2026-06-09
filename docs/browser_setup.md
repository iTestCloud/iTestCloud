# Browser Setup
The framework is supposed to support Firefox, Google Chrome, Internet Explorer and Safari. However, only deep testing have been made using the Firefox and Chrome browsers.

Here are the setup recommendation for all these browsers.

### Google Chrome

Please complete the following steps to configure Google Chrome for developing and/or executing (running) tests:

1. Check the version of Chrome running on your system.
2. Download the Chrome driver matching the version of Chrome from [here](https://chromedriver.chromium.org/downloads).
3. Extract the downloaded Chrome Driver to a directory (e.g., `C:\itestcloud\drivers\` for Windows or `/Users/Shared/itestcloud/drivers/` for macOS).
4. (For macOS) Control-click the chromedriver executable and choose `Open` from the shortcut menu. This will take care of the problem of "Apple can’t check app for malicious software."
5. Create the profiles directory which will contain Chrome runtime files (e.g., `C:\itestcloud\profiles\chrome\` or `/Users/Shared/itestcloud/profiles/chrome/`).
6. In your project's browser properties file (e.g., `params/browser/chrome.properties`), check the values of the following properties and update them as needed: `browserDriver` and `browserProfile`.

### Firefox

Please complete the following steps to configure Firefox for developing and/or executing (running) tests:

1. Download the latest ESR or stable version of [Firefox](https://www.mozilla.org/en-US/firefox/new/).
2. Install Firefox. If installing on macOS or a custom Windows location, note the installation path.
3. Download the latest [Gecko Driver](https://github.com/mozilla/geckodriver/releases).
4. Extract the downloaded Gecko Driver to your drivers directory (e.g., `C:\itestcloud\drivers\` or `/Users/Shared/itestcloud/drivers/`).
5. Open your project's `params/browser/firefox.properties` file, check the values of the following properties and update them as needed: `browserPath`, `browserDriver`, and `browserProfile`.

### Microsoft Edge

Please complete the following steps to configure Microsoft Edge for testing:

1. Check the version of Microsoft Edge running on your system.
2. Download the matching Edge WebDriver from the [Microsoft Edge WebDriver site](https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/).
3. Extract the downloaded `msedgedriver` to your drivers directory.
4. Update your project's `params/browser/edge.properties` file with the correct `browserDriver` path.

### Safari

For macOS users, Safari provides native WebDriver support. Complete the following steps:

1. Enable the Develop menu in Safari by going to **Safari > Preferences > Advanced** and checking **"Show Develop menu in menu bar"**.
2. Open the Develop menu and click **"Allow Remote Automation"**.
3. You do not need to download a separate driver; the `safaridriver` executable is included with macOS.
4. Update your `params/browser/safari.properties` if any specific configurations are required.

---
**Documentation Navigation:**
[Home](../README.md) | [Eclipse Setup](eclipse_setup.md) | [Browser Setup](browser_setup.md) | [Test Run Setup](test_run_setup.md) | [Eclipse Execution](eclipse_execution.md) | [Command Line Execution](cmdln_execution.md) | [Jenkins Execution](jenkins_execution.md) | [Jenkins Slave Setup](jenkins_slave_setup.md) | [Scenario Development](scenario_development.md) | [Test Scenarios](test_scenarios.md) | [Coding Style](coding_style.md) | [Javadoc Standards](javadoc_standards.md)
