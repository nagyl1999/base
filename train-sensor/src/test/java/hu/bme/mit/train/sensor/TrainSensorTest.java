package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;

import hu.bme.mit.train.user.TrainUserImpl;
import hu.bme.mit.train.sensor.TrainSensorImpl;
import hu.bme.mit.train.controller.TrainControllerImpl;

import hu.bme.mit.train.sensor.TrainSensorImpl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TrainSensorTest {

    private TrainUser user;

    private TrainSensor sensor;
    
    private TrainController controller;

    @Before
    public void before() {
        user = mock(TrainUserImpl.class);
        controller = mock(TrainControllerImpl.class);
        sensor = new TrainSensorImpl(controller, user);
    }

    @Test
    public void setAlarmWhenSpeedIsOk() {
        sensor.overrideSpeedLimit(5);
        verify(user, times(1)).setAlarmState(false);
    }

    @Test
    public void setAlarmWhenSpeedBelowZero() {
        sensor.overrideSpeedLimit(-1);
        verify(user, times(1)).setAlarmState(true);
    }

    @Test
    public void setAlarmWhenSpeedAbove500() {
        sensor.overrideSpeedLimit(501);
        verify(user, times(1)).setAlarmState(true);
    }

    @Test
    public void setAlarmWhenSpeedIsRelativelyFalse() {
        sensor.overrideSpeedLimit(1);
        verify(user, times(1)).setAlarmState(true);
    }

    @Test
    public void ThisIsAnExampleTestStub() {
        // TODO Delete this and add test cases based on the issues
    }
}
