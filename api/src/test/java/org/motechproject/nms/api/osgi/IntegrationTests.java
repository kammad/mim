package org.motechproject.nms.api.osgi;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * HelloWorld bundle integration tests suite.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        UserControllerBundleIT.class
})
public class IntegrationTests {
}
