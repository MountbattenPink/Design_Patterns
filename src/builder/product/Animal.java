package builder.product;

import java.util.ArrayList;

/**
 * Created by pc on 18.01.2016.
 */
public class Animal {
    private ArrayList<Characteristic>characteristics;
    private Habitat habitat;

    public Animal() {
        characteristics = new ArrayList<>();
    }

    public Animal(ArrayList<Characteristic> characteristics) {
        this.characteristics = characteristics;
    }

    public void addCharacteristic(Characteristic characteristic){
        characteristics.add(characteristic);
    }
    public int getWeight(){
        int weight=0;
        for (Characteristic characteristic:characteristics){
            weight+=characteristic.getWeight();
        }
        return weight;
    }


    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        builder.append("\n\nAnimal:\n");
        for (Characteristic characteristic:characteristics){
            builder.append(characteristic.getName())
                    .append("\n");
        }
        if (habitat!=null){builder.append("Lives in: ").append(this.habitat.getName());}
        builder.append("\nweight: ")
                .append(this.getWeight());
        return builder.toString();
    }
}
