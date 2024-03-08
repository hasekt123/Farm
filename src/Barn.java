import java.util.ArrayList;

public class Barn {
    private ArrayList<Animal>
    animals = new ArrayList<>();
    private int maxHuge = 10;
    private int maxMidget = 10;

    public boolean pridejZvire(Animal animal){
        int pocetHuge = 0;
        int pocetMidget = 0;

        for (Animal z : animals) {
            if (
                    (z.getSize().equals("velke"))) {
                pocetHuge++;
            }else  if (z.getSize().equals("male")){

            }
            }
        pocetMidget++;

    }
}