/*********************************************************************
 * Copyright (c) 2024 IBM Corporation and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *********************************************************************/
package itest.cloud.ibm.test.step.ca;

import org.junit.jupiter.api.*;

import itest.cloud.ibm.test.scenario.ca.CaTestScenarioStep;

/**
 * This class defines a set of tests to validate the prerequisites and their associated functionality.
 * <p>
 * The following is a list of tests associated with this test suite:
 * <ul>
 * <li>{@link #test01_OpenHomePage()}: Set the cloud account associated with the default user.</li>
 * </ul>
 * </p>
 */
@org.junit.platform.suite.api.Suite
@org.junit.platform.suite.api.SelectClasses({/* TODO */})
@TestMethodOrder(MethodOrderer.MethodName.class)
public class Step01_PrerequisitesTests extends CaTestScenarioStep {

	private static final String REPORT_PATH = "Samples/By business function/Customer experience/Reports/Daily agent activity";

/**
 * Open the Home page.
 */
@Test
public void test01_OpenHomePage() {
	openHomePage(getTestUser());
}

/**
 * Open the Report.
 */
@Test
public void test02_OpenReport() {
	openReport(REPORT_PATH, getTestUser());
}

/**
 * Open the Content page.
 */
@Test
public void test03_OpenContentPage() {
	openContentPage(getTestUser());
}

/**
 * Open the Report.
 */
@Test
public void test04_ReopenReportViaViewSwitcherMenu() {
	openReport(REPORT_PATH, getTestUser());
}

/**
 * Log out the user.
 */
@Test
public void test99_Logout() {
	logout(getTestUser());
}
}