package com.kodilla.patterns.singleton;

public class SettingsFileEngine {

    //charakterystyczne dla singletona
    private static SettingsFileEngine settingsFileEngineInstance = null;
    private String fileName = "";

    //ukryty konstruktor
    private SettingsFileEngine() {
    }

    //metoda getInstance()
    public static SettingsFileEngine getInstance() {
        if (settingsFileEngineInstance == null) {
            settingsFileEngineInstance = new SettingsFileEngine();
        }

        //kształt getInstance() odporny na wielowątkowość
        /*if (settingsFileEngineInstance == null) {
            synchronized(SettingsFileEngine.class) {
                if (settingsFileEngineInstance == null) {
                    settingsFileEngineInstance = new SettingsFileEngine();
                }
            }
        }*/

        return settingsFileEngineInstance;
    }

    public String getFileName() {
        return fileName;
    }

    public void open(final String fileName) {
        this.fileName = fileName;
        System.out.println("Opening the settings file");
    }

    public void close() {
        this.fileName = "";
        System.out.println("Closing the settings file");
    }

    public boolean loadSettings() {
        System.out.println("Loading settings from file");
        return true;
    }

    public boolean saveSettings() {
        System.out.println("Saving settings to file");
        return true;
    }
}
