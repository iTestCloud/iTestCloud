package itest.cloud.scenario;

import java.lang.reflect.Method;

import org.junit.jupiter.api.extension.*;

public class ScenarioStepExtension implements InvocationInterceptor, BeforeAllCallback, AfterAllCallback, BeforeEachCallback, AfterEachCallback {

    @Override
    public void beforeAll(final ExtensionContext context) throws Exception {
        // Equivalent to ScenarioStep.setUpStep()
        ScenarioStep.IS_NEW_STEP = true;
    }

    @Override
    public void afterAll(final ExtensionContext context) throws Exception {
        // Any class-level teardown
    }

    @Override
    public void beforeEach(final ExtensionContext context) throws Exception {
    }

    @Override
    public void afterEach(final ExtensionContext context) throws Exception {
        // Equivalent to ScenarioStep.tearDownTest()
        ScenarioStep.IS_NEW_STEP = false;
    }

    @Override
    public void interceptTestMethod(final Invocation<Void> invocation, final ReflectiveInvocationContext<Method> invocationContext, final ExtensionContext extensionContext) throws Throwable {
        Object target = invocationContext.getTarget().orElse(null);
        if (target instanceof ScenarioStep) {
            ScenarioStep step = (ScenarioStep) target;
            if (step.scenarioExecution != null) {
                step.scenarioExecution.runTest(invocation, invocationContext.getExecutable(), target, ScenarioStep.IS_NEW_STEP);
                return;
            }
        }
        invocation.proceed();
    }
}
