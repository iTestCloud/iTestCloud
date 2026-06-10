package itest.cloud.ibm.scenario;
import itest.cloud.scenario.ScenarioRunner;
abstract public class IbmScenarioRunner extends ScenarioRunner implements IbmScenarioConstants {
	protected IbmScenarioData getScenarioData(){ return getScenarioExecution().getData(); }
	@Override public IbmScenarioExecution getScenarioExecution() { return (IbmScenarioExecution) super.getScenarioExecution(); }
	@Override protected void initAnnotationFilters() { super.initAnnotationFilters(); }
}