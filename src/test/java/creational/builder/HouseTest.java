package creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    @Test
    public void testHouse(){
        House.HouseBuilder houseBuilder = new House.HouseBuilder(2,4);
        houseBuilder.setHasGarage(true)
                .setHasGarden(false);
        House house = houseBuilder.build();
        assertEquals(2, house.getBedrooms());
    }

}