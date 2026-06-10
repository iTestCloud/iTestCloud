/*********************************************************************
 * Copyright (c) 2024, 2026 IBM Corporation and others.
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
package itest.cloud.ibm.test.step.wxbi;

import org.junit.jupiter.api.*;

import itest.cloud.ibm.test.scenario.wxbi.WxbiTestScenarioStep;

/**
 * This class defines a set of tests to validate establishing prerequisites of the scenario.
 * <p>
 * The following is a list of tests associated with this test suite:
 * <ul>
 * <li>{@link #test01_SetAccount()}: Set the cloud account associated with the default user.</li>
 * </ul>
 * </p>
 */
@org.junit.platform.suite.api.Suite
@org.junit.platform.suite.api.SelectClasses({/* TODO */})
@TestMethodOrder(MethodOrderer.MethodName.class)
public class StepA01_PrerequisiteTests extends WxbiTestScenarioStep {

/**
 * Set the cloud account associated with the default user.
 */
@Test
public void test01_SetAccount() {
	if(getWxbiApplication().isCloudApplication()) {
		setAccount(getData().getTestUserCloudAccount(), getData().getTestUser());
	}
}
}