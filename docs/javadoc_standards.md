# 📖 Javadoc Standards

Javadoc is a critical part of developing in Java. This guide defines formatting guidelines and conventions to write clear, consistent, and readable Javadoc comments across the iTestCloud project.

---

### 🧠 Core Philosophy: Javadoc is Source Code

Javadoc serves a dual purpose:
1. Generating clean external HTML API documentation.
2. Assisting developers reading and maintaining the code in the IDE.

Always write Javadoc with the reader's clarity in mind.

---

### 🎨 Formatting Standards

#### 1. Standard Comment Syntax
Start comments with `/**`, end them with `*/`, and prefix intermediate lines with a single space and asterisk.

```java
/**
 * This is a standard Javadoc comment.
 */
public void executeAction()
```

> [!WARNING]
> Do **NOT** use extra asterisks at the beginning (e.g. `/***`) or end (e.g. `**/`) of comments.

#### 2. Target APIs
* **Required:** All `public` and `protected` classes, interfaces, methods, and fields.
* **Optional:** `private` members can have Javadocs if the logic is complex.
* **Overridden Methods:** Only document overridden methods if the subclass changes the behavior or updates the contracts.

---

### 📝 Writing Guidelines

#### ✍️ The Summary Sentence (First Sentence)
The first sentence of a doc comment must stand on its own as a complete, concise summary of the element.
* **Grammar:** Use 3rd person descriptive (declarative) form rather than 2nd person imperative.
  * *Correct:* `Gets the label of this page.`
  * *Incorrect:* `Get the label of this page.`
* **Avoid Period Ambiguity:** The Javadoc parser splits the summary at the first period. Avoid abbreviations containing periods (like `Prof. Knuth`). Use `&nbsp;` after the period to bypass this (e.g. `Prof.&nbsp;Knuth`).

#### 💻 HTML and Inline Tags
* Offset keywords, types, and variables using `<code>...</code>` (e.g., `<code>null</code>`, `<code>true</code>`, `<code>String</code>`).
* Use `{@link ClassName}` to link to other types.
* Avoid Latin abbreviations:
  * Instead of *e.g.*, write **for example**.
  * Instead of *i.e.*, write **that is** or **to be specific**.
  * Instead of *aka*, write **also known as**.

---

### ⚙️ Tag Specifications

* **Formatting Spacing:** Add one blank line between the descriptive text and the first block tag (like `@param` or `@return`).
* **`@param` & `@return`:** Explicitly document the tolerance and handling of `null` references for parameters and return types.
* **`@throws`:** Frame exception conditions like an `if` clause:
  ```java
  /**
   * @throws ScenarioFailedError if the specified file does not exist.
   */
  ```
* **Avoid `@author`:** Do not include the `@author` tag.

---

### 🌐 Documentation Navigation

| 🚀 Getting Started | 🛠️ Configuration & Setup | 💻 Execution | 📚 reference: Reference |
| :--- | :--- | :--- | :--- |
| [🏠 Home](../README.md) | [🌙 Eclipse Setup](eclipse_setup.md) | [⚡ From Eclipse](eclipse_execution.md) | [📝 Scenario Development](scenario_development.md) |
| | [🌐 Browser Setup](browser_setup.md) | [💻 Command Line](cmdln_execution.md) | [📋 Test Scenarios](test_scenarios.md) |
| | [🔑 Test Run Setup](test_run_setup.md) | [⚙️ Jenkins CI](jenkins_execution.md) | [🎨 Coding Style](coding_style.md) |
| | [🤖 Jenkins Slave Setup](jenkins_slave_setup.md) | | [📖 Javadoc Standards](javadoc_standards.md) \| [📄 License](../LICENSE) |
