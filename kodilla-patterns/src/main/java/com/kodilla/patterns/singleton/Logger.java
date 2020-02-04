package com.kodilla.patterns.singleton;

public class Logger {

    private static Logger lastLogInstance = null;
    private String lastLog = "";

    private Logger() {
    }

    public static Logger getInstance() {
        if (lastLogInstance == null) {
            lastLogInstance = new Logger();
        }
        return lastLogInstance;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}
