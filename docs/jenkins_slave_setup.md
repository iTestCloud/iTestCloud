# Jenkins Slave Setup

1. Deploy a Linux VM (e.g., RHEL, Ubuntu) in your infrastructure environment.
2. Go to the Jenkins server and create a new node from an existing node (if you have a template). Specify the host name of the newly deployed VM as the `Host`.
3. If an existing node does not exist, create a new node, and specify the information as well as the environment variables mentioned below: 
   - `Host` = host name of the newly deployed VM
   - `Remote root directory` = `/home/automation/jenkins`
   - `CHROME_DRIVER` = `/opt/drivers/chromedriver`
   - `FF_DRIVER` = `/opt/drivers/geckodriver`
   - `FF_PATH` = `/opt/firefox/firefox`
4. Once the node has been added, open the newly created node. A command should be available under the `Run from agent command line` section in the node page: 
   `java -jar agent.jar -jnlpUrl https://<jenkins-url>/computer/<vm-name>/slave-agent.jnlp -secret XXXXXXXXXXX -workDir "/home/automation/jenkins"`
5. Copy the secret code from the above mentioned command and keep it in a separate place for the moment. The secret code is given where the `XXXXXXXXXXX` is in the above mentioned command.
6. Install prerequisite software on the new VM. Depending on your organization, you may have setup scripts (e.g., `root_setup.sh`, `user_setup.sh`) available in your deployment repository. 
7. If running a setup script as root, you may be prompted to provide the VM hostname and the secret code copied in step 5. Ensure that a local user (e.g., `automation`) is created for running Jenkins tasks. 
8. Login as the `automation` user on the VM and complete any user-level setups (such as configuring VNC or Xvfb for headless browser testing). Record any passwords created for future use.
9. Confirm that you have the right version of the Chrome driver installed for the version of Chrome browser you have installed. Chrome driver version can be verified with `/opt/drivers/chromedriver --version` and Chrome browser version with `/opt/google/chrome/chrome --version`. This website will tell you which versions of the Chrome driver match up with which versions of the Chrome browser: https://chromedriver.chromium.org/downloads . Update the Chrome driver if necessary.
10. Go to the Jenkins server and verify that the newly added slave/agent is now connected and online.

---
**Documentation Navigation:**
[Home](../README.md) | [Eclipse Setup](eclipse_setup.md) | [Browser Setup](browser_setup.md) | [Test Run Setup](test_run_setup.md) | [Eclipse Execution](eclipse_execution.md) | [Command Line Execution](cmdln_execution.md) | [Jenkins Execution](jenkins_execution.md) | [Jenkins Slave Setup](jenkins_slave_setup.md) | [Scenario Development](scenario_development.md) | [Test Scenarios](test_scenarios.md) | [Coding Style](coding_style.md) | [Javadoc Standards](javadoc_standards.md)
