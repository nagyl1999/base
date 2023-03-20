package hu.bme.mit.train.interfaces;

public interface TrainController {

	void emergencyBreak();

	void followSpeed();

	int getReferenceSpeed();

	void setSpeedLimit(int speedLimit);

	void setJoystickPosition(int joystickPosition);

}
