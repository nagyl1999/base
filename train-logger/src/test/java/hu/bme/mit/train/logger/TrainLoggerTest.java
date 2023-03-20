package hu.bme.mit.train.logger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.system.TrainSystem;

public class TrainLoggerTest {
    public TrainLoggerImp logger;

    @Before
    public void before() {
        TrainSystem system = new TrainSystem();
        logger = new TrainLoggerImp(system.getUser(), system.getController());
    }

    @Test
    public void ThisIsAnExampleTestStub() {
        logger.log();
    }
}
