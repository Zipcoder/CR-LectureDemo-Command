package io.zipcoder.tc_design_electronics.commands;

import io.zipcoder.tc_design_electronics.electronics.receivers.Electronic;

/**
 * Created by leon on 9/5/17.
 */
public class TurnOnElectronic implements Command {
    protected Electronic electronic;

    public TurnOnElectronic(Electronic electronic) {
        this.electronic = electronic;
    }

    public void execute() {
        electronic.on();
    }

    public void undo() {
        electronic.off();
    }
}
