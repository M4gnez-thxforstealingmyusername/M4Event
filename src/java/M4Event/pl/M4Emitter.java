package M4Event.pl;

import M4Event.M4Receiver;

import java.util.ArrayList;
import java.util.List;

public class M4Emitter {
    private final List<M4Receiver> receivers;

    public M4Emitter() {
        this.receivers = new ArrayList<>();
    }

    public M4Emitter(M4Receiver[] receivers) {
        this.receivers = List.of(receivers);
    }

    public void addReceiver(M4Receiver receiver){
        this.receivers.add(receiver);
    }

    public void emitEvent(){
        for(var receiver : this.receivers){
            receiver.onEvent(new M4Args(receiver));
        }
    }

}
