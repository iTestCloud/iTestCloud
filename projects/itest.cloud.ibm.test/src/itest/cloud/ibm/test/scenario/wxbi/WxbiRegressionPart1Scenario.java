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
package itest.cloud.ibm.test.scenario.wxbi;

import itest.cloud.annotation.Scenario;
import itest.cloud.ibm.test.step.wxbi.StepA01_PrerequisiteTests;

@Scenario("WatsonX BI Assistant Regression Scenario Part 1")
@org.junit.platform.suite.api.Suite
@org.junit.platform.suite.api.SelectClasses({
	StepA01_PrerequisiteTests.class,

//	StepB01_UiReadinessTests.class,
//	StepB02_BasicQuestionsTests.class,
//	StepB03_GreenThreadTests.class,
//	StepB04_SwitchingThroughVisualizationsTests.class,
//	StepB05_AveryDemoQuestionsTests.class,
//	StepB06_KasDemoQuestionsTests.class,
//
//	StepC16_PinningVisualizationOfTypeDialInCarouselTests.class,
//	StepC17_PinningVisualizationOfTypeHeatmapInCarouselTests.class,
//	StepC18_PinningVisualizationOfTypeDecisionTreeInCarouselTests.class,
//	StepC19_PinningVisualizationOfTypeSpiralInCarouselTests.class,
//	StepC20_PinningVisualizationOfTypeDriverAnalysisInCarouselTests.class,
//	StepC21_PinningVisualizationOfTypeSunbirstInCarouselTests.class,
//	StepC22_PinningVisualizationOfTypeAreaInCarouselTests.class,
//	StepC23_PinningVisualizationOfTypeLineInCarouselTests.class,
//	StepC24_PinningVisualizationOfTypeSummaryInCarouselTests.class,
//
//	StepE01_BasicModelingTests.class,
//
//	StepZ01_CleanupTests.class
})
public class WxbiRegressionPart1Scenario {
}
