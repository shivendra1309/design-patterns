package creational.builder;

import lombok.Getter;

public class House {
    //required parameters
    private int bedrooms;
    private int bathrooms;

    //optional parameters
    private boolean hasGarden;
    private boolean hasGarage;

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    private House(HouseBuilder houseBuilder){
        this.bedrooms = houseBuilder.bedrooms;
        this.bathrooms = houseBuilder.bathrooms;
        this.hasGarage = houseBuilder.hasGarage;
        this.hasGarden = houseBuilder.hasGarden;
    }

    //Builder Class
    public static class HouseBuilder{

        //required parameters
        private int bedrooms;
        private int bathrooms;

        //optional parameters
        private boolean hasGarden;
        private boolean hasGarage;

        public HouseBuilder(int bedrooms, int bathrooms){
            this.bedrooms=bedrooms;
            this.bathrooms=bathrooms;
        }

        public HouseBuilder setHasGarden(boolean hasGarden){
            this.hasGarage = hasGarden;
            return this;
        }

        public HouseBuilder setHasGarage(boolean hasGarage){
            this.hasGarage = hasGarage;
            return this;
        }
        public House build(){
            return new House(this);
        }
    }
}
