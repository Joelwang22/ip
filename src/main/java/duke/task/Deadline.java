package duke.task;

import duke.util.TimeManager;

/**
 * Represents a deadline task in duke.Duke chat-bot.
 * A deadline task has an end time in addition to the properties inherited from Task.
 */
public class Deadline extends Task {

    private String end;

    /**
     * Constructs a new Deadline task with the specified name and end time.
     * The end time is parsed and formatted by the TimeManager.
     *
     * @param name The name of the deadline task.
     * @param end The end time for the deadline, in a format understood by TimeManager.parseTime.
     */
    public Deadline(String name, String end) {
        super(name);
        this.end = TimeManager.parseTime(end);
    }

    /**
     * Retrieves the type identifier for a deadline task.
     *
     * @return A string representing the type of the task, specifically "[D]" for deadlines.
     */
    @Override
    public String getType(){
        return "[D]";
    }

    /**
     * Retrieves the formatted time for the deadline task.
     *
     * @return A string representing the end time, formatted as "(by: [end time])".
     */
    @Override
    public String getTime(){
        return "(by: " + end + ")";
    }

    /**
     * Retrieves the raw end time for the deadline task.
     *
     * @return The end time as a string, in the format provided to the constructor.
     */
    @Override
    public String getRawTime(){
        return this.end;
    }
}
