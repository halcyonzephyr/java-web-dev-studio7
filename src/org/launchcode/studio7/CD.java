package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{

    public CD(String name) {
        super(name);
        discType = "CD";
        totalCapacity = 650.00;
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }


}
