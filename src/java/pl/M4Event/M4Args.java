package pl.M4Event;

public class M4Args {
    private final Object sender;

    /**
     * creates event args
     *
     * @param sender: sender of the event
     */
    public M4Args(Object sender){
        this.sender = sender;
    }

    /**
     * gets sender of the event
     * @return event sender
     */
    public Object getSender() {
        return sender;
    }
}
