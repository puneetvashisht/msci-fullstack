package creational;

class House {
    private String foundation;
    private String walls;
    private String roof;

    // Getters and Setters
    public void setFoundation(String foundation) { this.foundation = foundation; }
    public void setWalls(String walls) { this.walls = walls; }
    public void setRoof(String roof) { this.roof = roof; }

    @Override
    public String toString() {
        return "House with " + foundation + ", " + walls + " walls, and " + roof;
    }
}

class HouseBuilder {
    private House house;

    public HouseBuilder() {
        this.house = new House();
    }

    public HouseBuilder buildFoundation(String foundation) {
        house.setFoundation(foundation);
        return this;
    }

    public HouseBuilder buildWalls(String walls) {
        house.setWalls(walls);
        return this;
    }

    public HouseBuilder buildRoof(String roof) {
        house.setRoof(roof);
        return this;
    }

    public House build() {
        return house;
    }
}


public class Builder {

    public static void main(String[] args) {
        House house = new HouseBuilder()
                  .buildFoundation("Concrete")
                  .buildWalls("Brick")
                  .buildRoof("Tiles")
                  .build();

System.out.println(house); // House with Concrete, Brick walls, and Tiles

    }
    
}
