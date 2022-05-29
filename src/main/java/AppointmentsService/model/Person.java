package AppointmentsService.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Person {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int ID;
    private String Name;

    Person(String _Name){
        this.ID = count.incrementAndGet();
        this.Name = _Name;
    }

    //---------------------------------------------------------

    void setName(String _Name){
        this.Name = _Name;
    }

    //---------------------------------------------------------

    String getName(){  return this.Name; }
    int getID(){ return this.ID; }
}
