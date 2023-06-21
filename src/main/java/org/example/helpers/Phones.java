package org.example.helpers;

public enum Phones {
    SamsungGalaxy_s6("Samsung galaxy s6"),
    NokiaLumia_1520("Nokia lumia 1520"),
    Nexus_6("Nokia lumia 1520"),
    SamsungGalaxy_s7("Samsung galaxy s7"),
    Iphone_6_32gb("Iphone 6 32gb"),
    SonyXperia_z5("Sony xperia z5"),
    HTCOne_M9("HTC One M9");

    public final String label;

    private Phones(String label){
        this.label = label;
    }
}
