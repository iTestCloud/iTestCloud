package itest.cloud.ibm.test.scenario;
import itest.cloud.ibm.scenario.IbmScenarioRunner;
abstract public class IbmTestScenarioRunner extends IbmScenarioRunner {
	public IbmTestScenarioRunner() {
		this.scenarioExecution = new IbmTestScenarioExecution();
	}
	@Override public IbmTestScenarioExecution getScenarioExecution() { return (IbmTestScenarioExecution) super.getScenarioExecution(); }
}