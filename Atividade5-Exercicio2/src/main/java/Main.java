import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Barco barco1 = new Barco("barco1", 2);
        Barco barco2 = new Barco("barco2", 5);
        Barco barco3 = new Barco("barco3", 7);
        Barco barco4 = new Barco("barco4", 12);
        Barco barco5 = new Barco("barco5", 20);
        PortoPequeno portoPequeno = new PortoPequeno();
        PortoGrande portoGrande = new PortoGrande();
        List<Barco> barcos = new ArrayList<>();
        barcos.add(barco1);
        barcos.add(barco2);
        barcos.add(barco3);
        barcos.add(barco4);
        barcos.add(barco5);
        for ( Barco i: barcos){
            portoPequeno.atracarBarco(i);
            portoGrande.atracarBarco(i);
        }
    }
}
