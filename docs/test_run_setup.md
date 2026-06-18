# 🔑 Test Run Setup

This guide details how to configure credentials, set VM execution flags in Eclipse, and encrypt sensitive keys for test scenarios.

---

### 👤 Personal Account Configuration

Using a personal test account avoids resource contention on shared cloud environments when multiple developers or pipelines execute tests simultaneously.

1. Create a personal test account in the target application's test instance.
2. Edit your project's local `secret.properties` file with your account's properties:
   * **Target Users:** `tester`, `tester2`, `authenticator`, `testUser`
   * **Required properties:**
     ```properties
     Username=your_username
     UserID=your_email@domain.com
     Email=your_email@domain.com
     Password=YOUR_ENCRYPTED_PASSWORD
     ```
3. If your application requires creating a new project in Object Storage, add the following property to your Eclipse Run Configuration VM arguments:
   ```bash
   -DobjectStorageName=CloudObjectStorage
   ```

---

### ⚙️ Eclipse VM Arguments Reference

You can pass system properties to fine-tune execution via Eclipse VM arguments:

| VM Argument | Purpose / Description | Example |
| :--- | :--- | :--- |
| `-DfirstStep` | The test step/group to start execution from (case-sensitive). | `-DfirstStep=G02` |
| `-DfirstTest` | The specific test number/identifier to start execution from. | `-DfirstTest=07` |
| `-DstopOnFailure` | Terminate the entire run immediately upon the first failure. | `-DstopOnFailure=true` |
| `-DrunDeepDiveTests`| Enables comprehensive deep-dive validation steps (typically used in CI). | `-DrunDeepDiveTests=true` |
| `-DverifyDependencies`| Enforce that prerequisite dependent tests have succeeded before running. | `-DverifyDependencies=false` |

> [!WARNING]
> **Skipping Steps and Dependencies**
> When skipping steps using `-DfirstStep`, prerequisite assertions may be skipped. Set `-DverifyDependencies=false` in these cases to prevent tests from failing setup checks.

---

### 🔒 Password Encryption Utility

To protect credentials, encrypt your plain-text passwords before storing them in `secret.properties`. Use this simple Java class:

```java
import com.ibm.itest.cloud.common.tests.utils.EncryptionUtils;

public class PasswordEncryptor {
    public static void main(String[] args) {
        String myPassword = "YourActualPasswordHere";
        System.out.println("Encrypted Password: " + EncryptionUtils._encrypt_(myPassword));
    }
}
```

---

### ⌨️ Useful Keyboard Shortcuts (Eclipse)

| Action | macOS Shortcut | Windows / Linux Shortcut |
| :--- | :--- | :--- |
| **Search Workspace for Files** | `Cmd + Shift + R` | `Ctrl + Shift + R` |
| **Search Workspace for Java Types** | `Cmd + Shift + T` | `Ctrl + Shift + T` |
| **Search Workspace for Selected Text** | `Cmd + Option + G` | `Ctrl + Alt + G` |
| **Close Current Editor** | `Cmd + W` | `Ctrl + W` |
| **Close All Active Editors** | `Cmd + Shift + W` | `Ctrl + Shift + W` |

---

### 🌐 Documentation Navigation

| 🚀 Getting Started | 🛠️ Configuration & Setup | 💻 Execution | 📚 reference: Reference |
| :--- | :--- | :--- | :--- |
| [🏠 Home](../README.md) | [🌙 Eclipse Setup](eclipse_setup.md) | [⚡ From Eclipse](eclipse_execution.md) | [📝 Scenario Development](scenario_development.md) |
| | [🌐 Browser Setup](browser_setup.md) | [💻 Command Line](cmdln_execution.md) | [📋 Test Scenarios](test_scenarios.md) |
| | [🔑 Test Run Setup](test_run_setup.md) | [⚙️ Jenkins CI](jenkins_execution.md) | [🎨 Coding Style](coding_style.md) |
| | [🤖 Jenkins Slave Setup](jenkins_slave_setup.md) | | [📖 Javadoc Standards](javadoc_standards.md) \| [📄 License](../LICENSE) |

