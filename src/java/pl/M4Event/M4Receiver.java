package pl.M4Event;

public interface M4Receiver {

    /**
     * triggered by M4Emitter on emitEvent()
     * @param e: event args
     */
    public void onEvent(M4Args e);
}
