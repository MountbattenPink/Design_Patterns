package builder;

import builder.product.*;

/**
 * Created by pc on 17.01.2016.
 */
public class AnimalBuilder {
    private Animal animal;
    private Tail tail;
    private Foot foot;
    private Head head;
    private Habitat habitat;

    public AnimalBuilder() {
        this.animal = new Animal();
    }

    public AnimalBuilder tail(Tail tail){
        this.tail = tail;
        animal.addCharacteristic(tail);
        return this;
    }

    public AnimalBuilder foot(Foot foot){
        this.foot=foot;
        animal.addCharacteristic(foot);
        return this;
    }

    public AnimalBuilder head(Head head){
        this.head=head;
        animal.addCharacteristic(head);
        return this;
    }

    public AnimalBuilder habitat(Habitat habitat){
        this.habitat=habitat;
        animal.setHabitat(habitat);
        return this;
    }

    public Animal build(){
        return animal;
    }
}
