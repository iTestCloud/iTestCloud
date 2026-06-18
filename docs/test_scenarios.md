# 📋 Test Scenarios & Coverage

The iTestCloud framework powers multiple specialized test scenarios created and maintained across different feature domains.

---

### 📂 Active Test Scenarios

Below is the list of active scenario repositories:

| Scenario Name | Description | Repository Link |
| :--- | :--- | :--- |
| **Regression Scenario** | Core UI regression suites validating workflows. | [com.ibm.itest.cloud.apsportal.regression](https://<git-server>/iTestCloud/com.ibm.itest.cloud.apsportal.regression) |
| **Documentation Scenario** | Verification of documentation tabs, links, and search indexing. | [com.ibm.itest.cloud.apsportal.documentation](https://<git-server>/iTestCloud/com.ibm.itest.cloud.apsportal.documentation) |
| **Streaming Scenario** | Validation of real-time streaming services and message brokers. | [com.ibm.itest.cloud.apsportal.streams](https://<git-server>/iTestCloud/com.ibm.itest.cloud.apsportal.streams) |
| **Exchange Scenario** | Verification of data sets, catalogs, notebooks, and community cards. | [com.ibm.itest.cloud.apsportal.exchange](https://<git-server>/iTestCloud/com.ibm.itest.cloud.apsportal.exchange) |
| **Catalog Scenario** | Comprehensive catalog asset, permission, and metric charting tests. | [com.ibm.itest.cloud.apsportal.catalog](https://<git-server>/iTestCloud/com.ibm.itest.cloud.apsportal.catalog) |

---

### 🎯 Functional Coverage Areas

The test suites validate a broad matrix of features and use cases:

#### 🌐 Generic & Core Features
* Home page rendering and core navigation links.
* User profile preferences and layout customizations.
* Object Storage instance lifecycle (provisioning, credentials, and deletion).
* Data connections creation, sharing across projects, and deletion.
* Project configuration, collaborator invitation/access permissions, and bookmark synchronization.

#### 📥 Data Import
* Cloud data services lifecycle management.
* Uploading local CSV resources into cloud data endpoints.
* Transferring object storage CSV files to remote database tables.
* Executing cross-service replication (e.g., Cloudant database to dashDB) using Shared/Private credentials.

#### 🗃️ Catalogs
* Catalog lifecycle validation.
* Asset creation and tagging (both structured and unstructured files).
* Format detection and privacy controls (public/private catalogs).
* Member permissions (viewers vs. editors) and admin roles.
* Dashboard telemetry reporting (e.g., *Discovered Business Types*, *Top 10 Assets*, *Active Users*).
* Integration pipelines linking catalog assets to projects.

#### 🛍️ Exchange
* Card validation (publisher metadata, creation timestamps, and bookmark options) on the first 25 datasets.
* Deep page verification (preview loaders, schema info, and permalinks).

#### 📖 Documentation & Help Centers
* Validation of user guide tabs (e.g. *Get Started*, *Analyze Data*, *Manage Data*).
* Table of contents traversal and dead-link validation.
* Article search performance and lookup via permalinks.
* Interactive UI widgets (e.g., "Like", "Bookmark", breadcrumbs, and "Go to Top" button).

#### ⚡ Streaming
* Message Hub cluster provisioning, configuration parameters, and removal.
* Ingestion pipelines validation.
* Topic replication and message delivery checks.

#### 💻 RStudio Integration
* Verification of integrated workspace setups (e.g., storage indicators, terminal, and console).

---

### 🌐 Documentation Navigation

| 🚀 Getting Started | 🛠️ Configuration & Setup | 💻 Execution | 📚 reference: Reference |
| :--- | :--- | :--- | :--- |
| [🏠 Home](../README.md) | [🌙 Eclipse Setup](eclipse_setup.md) | [⚡ From Eclipse](eclipse_execution.md) | [📝 Scenario Development](scenario_development.md) |
| | [🌐 Browser Setup](browser_setup.md) | [💻 Command Line](cmdln_execution.md) | [📋 Test Scenarios](test_scenarios.md) |
| | [🔑 Test Run Setup](test_run_setup.md) | [⚙️ Jenkins CI](jenkins_execution.md) | [🎨 Coding Style](coding_style.md) |
| | [🤖 Jenkins Slave Setup](jenkins_slave_setup.md) | | [📖 Javadoc Standards](javadoc_standards.md) \| [📄 License](../LICENSE) |
