package io.zipcoder.tc_design_electronics.electronics.receivers;

/**
 * Created by leon on 9/5/17.
 * Behaves as our `receiver`
 */
public class Television extends MediaDevice {

    @Override
    public void on() {
        super.on();
        System.out.println("TV is on");
    }

    @Override
    public void off() {
        super.off();
        System.out.println("TV is off");
    }

    @Override
    public void volumeUp() {
        super.volumeUp();
        System.out.println("Volume is at " + getVolume());
    }

    @Override
    public void volumeDown() {
        super.volumeDown();
        System.out.println("Volume is at " + getVolume());
    }
}
