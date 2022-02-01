package org.launchcode.studio7;

import java.util.ArrayList;

public class BaseDisc {
    String name;
    ArrayList contents = new ArrayList<>();
    String discType;
    Double availableCapacity = totalCapacity - usedCapacity;
    Double totalCapacity;
    Double usedCapacity;

    public BaseDisc(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList getContents() {
        return contents;
    }

    public void setContents(ArrayList contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public Double getTotalCapacity() {
        return totalCapacity;
    }

}
