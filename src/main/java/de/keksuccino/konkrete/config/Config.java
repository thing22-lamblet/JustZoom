package de.keksuccino.konkrete.config;

public class Config {
    public Config(String filename) {

    };
    public void registerValue(String name, double value, String subName, String desc) {
    };
    public void registerValue(String name, bool value, String subName, String desc) {
    };
    public double getOrDefault(String name, double defValue) {
        return 0;
    };
    public bool getOrDefault(String name, bool defValue) {
        return false;
    };
    public void clearUnusedValues() {};
}
