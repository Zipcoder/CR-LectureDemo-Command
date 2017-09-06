package io.zipcoder.tc_design_electronics.electronics.invokers;

import io.zipcoder.tc_design_electronics.commands.Command;
import io.zipcoder.tc_design_electronics.commands.TurnOnElectronic;
import io.zipcoder.tc_design_electronics.commands.TurnUpMediaDevice;
import io.zipcoder.tc_design_electronics.electronics.receivers.MediaDevice;

/**
 * Created by leon on 9/5/17.
 * Invoker has reference to receiver
 * Invoker has composite Commmands
 * Commands take argument of receiver
 */
public class MediaDeviceRemote {
    private final MediaDevice receiver;
    private final Command onButton;
    private final Command volumeUpButton;

    public MediaDeviceRemote(MediaDevice mediaDevice) {
        TurnOnElectronic turnOnCommand = new TurnOnElectronic(mediaDevice);
        TurnUpMediaDevice turnUpVolumeCommand = new TurnUpMediaDevice(mediaDevice);

        this.receiver = mediaDevice;
        this.onButton = turnOnCommand;
        this.volumeUpButton = turnUpVolumeCommand;
    }

    public MediaDevice getRemoteDevice() {
        return this.receiver;
    }

    public void pressOn() {
        onButton.execute();
    }

    public void pressOff() {
        onButton.undo();
    }

    public void pressVolumeUp() {
        volumeUpButton.execute();
    }


    public void pressVolumeDown() {
        volumeUpButton.undo();
    }
}
