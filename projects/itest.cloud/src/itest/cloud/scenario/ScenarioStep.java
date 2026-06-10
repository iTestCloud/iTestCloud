/*********************************************************************
 * Copyright (c) 2012, 2026 IBM Corporation and others.
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
package itest.cloud.scenario;

import static itest.cloud.scenario.ScenarioUtil.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.suite.api.Suite;

import itest.cloud.browser.Browser;
import itest.cloud.config.Config;
import itest.cloud.config.IUser;
import itest.cloud.page.Page;
import itest.cloud.topology.Topology;

/**
 * Manage a list of tests to execute in a scenario step.
 * <p>
 * Scenario may have several steps which are defined using a specific {@link ScenarioRunner}
 * and a list of classes as argument of {@link Suite} annotation.
 * </p><p>
 * The step provides easy access to scenario configuration and data through its
 * {@link ScenarioExecution} stored instance.
 * </p><p>
 * This step is connected to a web page. The page might be stored by the step
 * when loaded. If so, it's automatically stored to the {@link ScenarioExecution}
 * at the end of the test execution to allow next test or step to have the last
 * page used by previous step in hand when starting.
 * </p><p>
 * The step also stores all workaround used during the tests and can provide
 * information about them.
 * </p>
 * Design: To be finalized
 */
@ExtendWith(ScenarioStepExtension.class)
public class ScenarioStep {

	// Step info
	protected static boolean IS_NEW_STEP = true;

	@BeforeAll
	public static void setUpStep() {
		IS_NEW_STEP = true;
	}

	// Execution
	protected ScenarioExecution scenarioExecution;



/**
 * @see Config#getBrowser()
 */
protected Browser getBrowser() {
	return getConfig().getBrowser();
}

/**
 * @see ScenarioExecution#getConfig()
 */
protected Config getConfig() {
	return this.scenarioExecution.config;
}

/**
 * The current test page or the page stored by the {@link ScenarioExecution}
 * if none was already stored.
 *
 * @return The page as a subclass of {@link Page}. May be <code>null</code>
 * if no page was stored neither in current test nor in previous one.
 */
protected Page getCurrentPage() {
//	return getBrowser().getCurrentPage();
	return Page.getCurrentPage();
}

/**
 * @see ScenarioExecution#getData()
 */
protected ScenarioData getData() {
	return this.scenarioExecution.data;
}

/**
 * The current test page or the page stored by the {@link ScenarioExecution}
 * if none was already stored.
 *
 * @return The page as a subclass of {@link Page}. May be <code>null</code>
 * if no page was stored neither in current test nor in previous one.
 * TODO Use {@link #getCurrentPage()} instead.
 */
protected Page getPage() {
//	if (this.page == null) {
//		this.page = getScenarioExecution().getPage();
//	}
//	return this.page;
	println("INFO: ScenarioStep.getPage() method is still used although getCurrentPage() should be used instead.");
	printStackTrace(1);
	return getCurrentPage();
}

/**
 * Return the scenario execution.
 *
 * @return The scenario execution as a {@link ScenarioExecution}.
 */
protected ScenarioExecution getScenarioExecution() {
	return this.scenarioExecution;
}

/**
 * Return the default user utilized for a scenario.
 *
 * @return The test user as {@link IUser}.
 */
protected IUser getTestUser() {
	return getData().getTestUser();
}

/**
 * @see ScenarioExecution#getTopology()
 */
protected Topology getTopology() {
	return getConfig().getTopology();
}

///**
// * Setup executed at the beginning of each test step.
// * <p>
// * So far, it only displays the step title when it's the first test and the test
// * title in the console.
// * </p>
// */
//@BeforeEach
//public void setUpTest() {
//
//	// Print step title
//	if (IS_FIRST_TEST) {
//		printStepStart(getScenarioExecution().stepName);
//	}
//
//	// Test case starting point
//	println("	- "+TIME_FORMAT.format(new Date(System.currentTimeMillis()))+": start test case '"+getScenarioExecution().testName+"'...");
//}

/**
 * Sleep for a given number of seconds if the server is considered slow.
 * <p>
 * Nothing happens if the server is not considered slow.
 * </p>
 * @param time Number of seconds the execution will sleep, if the server
 * is considered slow.
 */
public void sleepIfSlowServer(final int time) {
	if (this.scenarioExecution.isSlowServer()) {
		if (DEBUG) println("		+ Slow server: sleeping for '" + time + "' seconds.");
		sleep(time);
	}
}

/**
 * Tear down executed at the end of each test step.
 * <p>
 * So far, it turn off the first step flag and stores the current page to the
 * scenario execution to pass it to next test.
 * </p>
 */
@AfterEach
public void tearDownTest() throws Exception {
	IS_NEW_STEP = false;
}
}
