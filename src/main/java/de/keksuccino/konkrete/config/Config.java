package de.keksuccino.konkrete.config;

public class Config {
    public Config(String filename) {

    };
    public void registerValue(String name, double value, String subName, String desc) {
    };
    public void registerValue(String name, boolean value, String subName, String desc) {
    };
    public double getOrDefault(String name, double defValue) {
        return 0;
    };
    public boolean getOrDefault(String name, boolean defValue) {
        return false;
    };
    public void clearUnusedValues() {};
    public void syncConfig() {};
}
