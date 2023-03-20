package hu.bme.mit.train.logger;

import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.interfaces.TrainController;

import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.Table;
import java.util.Date;


public class TrainLoggerImp {
    private Table<Date, Integer, Integer> data;
    private TrainUser user;
    private TrainController controller;

    public TrainLoggerImp(TrainUser user, TrainController controller) {
        data = TreeBasedTable.create();
        this.user = user;
        this.controller = controller;
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public void log() {
        data.put(
            new Date(),
            user.getJoystickPosition(),
            controller.getReferenceSpeed()
        );
    }

}