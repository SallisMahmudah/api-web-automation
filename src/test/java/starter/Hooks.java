package starter;

import cucumber.api.java.Before;

public class Hooks extends TestInstrument {

    @Before
    public void beforeScenario() {
        if (isWeb()) {
            setUp();
            Runtime.getRuntime().addShutdownHook(new Thread(TestInstrument::tearDown));
        }
    }
}
