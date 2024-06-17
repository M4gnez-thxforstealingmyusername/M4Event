package pl.M4Event;

import java.util.ArrayList;
import java.util.List;

public class M4Emitter {
    protected final List<M4Receiver> receivers;

    /**
     * creates emitter with empty list of receivers
     */
    public M4Emitter() {
        this.receivers = new ArrayList<>();
    }

    /**
     * creates emitter with predetermined list of receivers
     * @param receivers: array of receivers
     */
    public M4Emitter(M4Receiver[] receivers) {
        this.receivers = List.of(receivers);
    }

    /**
     * adds new object to the list of receivers
     *
     * @param receiver: receiver to be added
     */
    public void addReceiver(M4Receiver receiver){
        this.receivers.add(receiver);
    }

    /**
     * emits a new event from template to all receivers
     *
     * @param sender: sender of the event
     */
    public void emitEvent(Object sender){
        for(var receiver : this.receivers){
            event(receiver, sender);
        }
    }

    /**
     * template for event
     *
     * @param receiver: receiver of the event
     * @param sender: sender of the event
     */
    protected void event(M4Receiver receiver, Object sender) {
        receiver.onEvent(new M4Args(sender));
    }


}
