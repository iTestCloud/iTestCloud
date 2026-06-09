# Test Run Setup
This guide explains how to configure your environment for executing tests, particularly when you need to avoid conflicts with other users.

## Using a personal account for test execution

To avoid conflicts on the cloud if tests are run by multiple users at the same time, you may want to conduct tests on a personal account.

1. Create a personal account on your application's test environment.
2. Edit the `secret.properties` file to include your own account details:
   - For **tester, tester2, authenticator, testUser:**
     - `Username`: Your name
     - `UserID`: Your email address
     - `Email`: Your email address
     - `Password`: Your encrypted password (see below)
3. Add `-DobjectStorageName=CloudObjectStorage` to the scenario VM arguments in Eclipse if required by your application to create a new project.

## Set up testing on a cluster
Edit the cluster properties file (e.g., `cluster.properties`) with the corresponding cluster URL and credentials.

## Adjust Eclipse VM arguments
Adjust the other VM arguments depending on what/how you want to test:
- `-DfirstStep`: The step/test group you want to start from. E.g., `G02` (capitalization matters)
- `-DfirstTest`: The specific test within a step/test group you want to start from. E.g., `07`
- `-DrunDeepDiveTests`: Usually reserved for CI/CD environments (like Jenkins), when we want to comprehensively run the tests.
- `-DstopOnFailure`: If you want to end the test executions on the first encountered failure.
- `-DverifyDependencies`: If you want to check that a test case's dependent tests are met before running it. **Important:** When skipping test cases through `-DfirstStep`, dependent tests will not be met, so this verification should be set to `false` in many skipping situations.

## Encrypt your password

You can run a simple standalone Java program to encrypt your password for the `secret.properties` file:

```java
import com.ibm.itest.cloud.common.tests.utils.EncryptionUtils;

public class PasswordEncryptor {
    public static void main(String[] args) {
        String myPassword = "YourActualPasswordHere";
        System.out.println("Encrypted Password: " + EncryptionUtils._encrypt_(myPassword));
    }
}
```

## Useful keyboard shortcuts

### Eclipse
**Searching for stuff:**
- `Command/Ctrl` + `Shift` + `R`: Search for **files** in the workspace by typing part of their names.
- `Command/Ctrl` + `Shift` + `T`: Search for **types** in the workspace by typing part of their names.
- `Command/Ctrl` + `Option/Alt` + `G`: Search for **highlighted string** within all files of a workspace.

**Managing your UI:**
- `Command/Ctrl` + `W`: Close currently opened file
- `Command/Ctrl` + `Shift` + `W`: Close all opened files

---
**Documentation Navigation:**
[Home](../README.md) | [Eclipse Setup](eclipse_setup.md) | [Browser Setup](browser_setup.md) | [Test Run Setup](test_run_setup.md) | [Eclipse Execution](eclipse_execution.md) | [Command Line Execution](cmdln_execution.md) | [Jenkins Execution](jenkins_execution.md) | [Jenkins Slave Setup](jenkins_slave_setup.md) | [Scenario Development](scenario_development.md) | [Test Scenarios](test_scenarios.md) | [Coding Style](coding_style.md) | [Javadoc Standards](javadoc_standards.md)
