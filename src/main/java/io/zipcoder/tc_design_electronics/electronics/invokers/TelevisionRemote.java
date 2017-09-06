package io.zipcoder.tc_design_electronics.electronics.invokers;

import io.zipcoder.tc_design_electronics.electronics.receivers.MediaDevice;
import io.zipcoder.tc_design_electronics.electronics.receivers.Television;

/**
 * Created by leon on 9/6/17.
 */
public class TelevisionRemote extends MediaDeviceRemote {
    public TelevisionRemote(Television mediaDevice) {
        super(mediaDevice);
    }
}
