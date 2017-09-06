package io.zipcoder.tc_design_electronics.commands;

/**
 * Created by leon on 9/5/17.
 */
public interface Command {
    public void execute();
    public void undo();
}
