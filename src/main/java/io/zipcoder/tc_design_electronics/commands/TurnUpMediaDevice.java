package io.zipcoder.tc_design_electronics.commands;

import io.zipcoder.tc_design_electronics.electronics.receivers.MediaDevice;

/**
 * Created by leon on 9/5/17.
 */
public class TurnUpMediaDevice implements Command {
    private MediaDevice mediaDevice;

    public TurnUpMediaDevice(MediaDevice mediaDevice) {
        this.mediaDevice = mediaDevice;
    }

    public void execute() {
        mediaDevice.volumeUp();
    }

    public void undo() {
        mediaDevice.volumeDown();
    }
}