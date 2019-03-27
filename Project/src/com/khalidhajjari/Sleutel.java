package com.khalidhajjari;

public class Sleutel {
    public int sleutelWaarde;
    public int inventory;

    breekbareBarricade b;
    SleutelVak s;

    public int getSleutelWaarde() {
        return sleutelWaarde;
    }

    public void setSleutelWaarde(int sleutelWaarde) {
        this.sleutelWaarde = sleutelWaarde;
    }

    public int updateInventory() {
        int m = getInventory() - b.getBarricadeWaarde();
        return m;
    }

    public int getInventory() {
        int test = getSleutelWaarde();
        inventory = test;

        return inventory;

    }


}

