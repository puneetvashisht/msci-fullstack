package day2;

import java.util.ArrayList;
import java.util.List;

public class TestBicycle {
    public static void main(String[] args) {
        RoadBicycle roadBicycle = new RoadBicycle(0, 0);
        // Bicycle bicycle = roadBicycle;
        // if(bicycle instanceof RoadBicycle){
        //     RoadBicycle rb = (RoadBicycle)bicycle;
        //     System.out.println(rb);
        // }
        MountainBicycle mountainBicycle = new MountainBicycle(0, 0);

        List<Bicycle> bicycles = new ArrayList<>();
        bicycles.add(roadBicycle);
        bicycles.add(mountainBicycle);

        // System.out.println(bicycles);

        for(Bicycle b : bicycles){
            b.speedUp(0);
            b.changeGear(1);
            System.out.println(b);
        }
        

        

    }
}
