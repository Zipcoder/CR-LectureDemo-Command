package io.zipcoder.tc_design_electronics.electronics.receivers;

/**
 * Created by leon on 9/5/17.
 * behaves as receiver

 */
abstract public class MediaDevice implements Electronic {
    private int volume = 0;
    private boolean isOn = false;

    public void on() {
        isOn = true;
    }

    public void off() {
        isOn = false;
    }

    public void volumeUp() {
        volume++;
    }

    public void volumeDown() {
        volume--;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return isOn;
    }
}
