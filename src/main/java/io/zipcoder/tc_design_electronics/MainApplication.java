package io.zipcoder.tc_design_electronics;

import io.zipcoder.tc_design_electronics.electronics.receivers.MediaDevice;
import io.zipcoder.tc_design_electronics.electronics.invokers.MediaDeviceRemote;
import io.zipcoder.tc_design_electronics.electronics.receivers.Television;

/**
 * Created by leon on 9/5/17.
 */
public class MainApplication {
    public static void main(String[] args) {
        MediaDevice television = new Television();
        MediaDeviceRemote televisionRemote = new MediaDeviceRemote(television);
        televisionRemote.pressOn();

        television.isOn();
    }
}
