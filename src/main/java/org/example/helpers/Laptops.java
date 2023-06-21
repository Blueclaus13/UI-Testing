package org.example.helpers;

public enum Laptops {
    SonyVaio_i5("Sony vaio i5"),
    SonyVaio_i7("Sony vaio i7"),
    MacBookAir("MacBook air"),
    Dell_i7_8gb("Dell i7 8gb"),
    Dell2017_156_Inch("2017 Dell 15.6 Inch"),
    MacBookPro("MacBook Pro");

    public final String label;

    private Laptops(String label){
        this.label = label;
    }

}
