package itest.cloud.scenario;
public abstract class ScenarioRunner  {
	protected ScenarioExecution scenarioExecution;
	public ScenarioExecution getScenarioExecution() { return this.scenarioExecution; }
	protected void initAnnotationFilters() {}
}